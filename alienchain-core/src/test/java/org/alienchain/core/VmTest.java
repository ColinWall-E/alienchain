/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.core;

import static org.ethereum.vm.util.BytecodeCompiler.compile;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.alienchain.core.Amount.Unit.NANO_ALX;
import static org.alienchain.core.Amount.Unit.ALX;
import static org.alienchain.core.Amount.ZERO;

import org.ethereum.vm.util.HashUtil;
import org.ethereum.vm.util.HexUtil;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.alienchain.Network;
import org.alienchain.config.Config;
import org.alienchain.config.Constants;
import org.alienchain.config.DevnetConfig;
import org.alienchain.core.state.AccountState;
import org.alienchain.core.state.DelegateState;
import org.alienchain.crypto.Hex;
import org.alienchain.crypto.Key;
import org.alienchain.rules.TemporaryDatabaseRule;
import org.alienchain.util.Bytes;
import org.alienchain.util.TimeUtil;
import org.alienchain.vm.client.AlienchainBlock;
import org.alienchain.vm.client.AlienchainBlockStore;

public class VmTest {

    @Rule
    public TemporaryDatabaseRule temporaryDBFactory = new TemporaryDatabaseRule();

    private Config config;
    private Blockchain chain;
    private AccountState as;
    private DelegateState ds;
    private TransactionExecutor exec;
    private Network network;

    @Before
    public void prepare() {
        config = new DevnetConfig(Constants.DEFAULT_DATA_DIR);
        chain = spy(new BlockchainImpl(config, temporaryDBFactory));
        as = chain.getAccountState();
        ds = chain.getDelegateState();
        exec = new TransactionExecutor(config, new AlienchainBlockStore(chain));
        network = config.network();

        doReturn(true).when(chain).isForkActivated(any(), anyLong());
    }

    /**
     * Just a basic test to check wiring so far
     */
  @Test
    public void testCall() {
        Key key = new Key();

        TransactionType type = TransactionType.CALL;
        byte[] from = key.toAddress();
        byte[] to = Bytes.random(20);
        Amount value = NANO_ALX.of(5);
        long nonce = as.getAccount(from).getNonce();
        long timestamp = TimeUtil.currentTimeMillis();

        // set the contract to a simple program
        byte[] contract = compile("PUSH2 0x1234 PUSH1 0x00 MSTORE PUSH1 0x20 PUSH1 0x00 RETURN");
        System.out.println(Hex.encode0x(contract));
        System.out.println(
                Hex.encode0x(HashUtil.calcNewAddress(Hex.decode0x("0x23a6049381fd2cfb0661d9de206613b83d53d7df"), 17)));
        as.setCode(to, contract);

        AlienchainBlock bh = new AlienchainBlock(
                new BlockHeader(123l, Bytes.random(20), Bytes.random(20), System.currentTimeMillis(),
                        Bytes.random(20), Bytes.random(20), Bytes.random(20), Bytes.random(20)),
                config.vmMaxBlockGasLimit());

        byte[] data = Bytes.random(16);
        long gas = 30000;
        long gasPrice = 1;

        Transaction tx = new Transaction(network, type, to, value, Amount.ZERO, nonce, timestamp, data, gas, gasPrice);
        tx.sign(key);
        assertTrue(tx.validate(network));

        // insufficient available
        TransactionResult result = exec.execute(tx, as.track(), ds.track(), bh, chain);
        assertFalse(result.getCode().isSuccess());

        Amount available = ALX.of(1000);
        as.adjustAvailable(key.toAddress(), available);

        // execute but not commit
        result = exec.execute(tx, as.track(), ds.track(), bh, chain);
        assertTrue(result.getCode().isSuccess());
        assertEquals(available, as.getAccount(key.toAddress()).getAvailable());
        assertEquals(ZERO, as.getAccount(to).getAvailable());

        // execute and commit
        result = executeAndCommit(exec, tx, as.track(), ds.track(), bh);
        assertTrue(result.getCode().isSuccess());
    }

    /**
     * Just a basic test to check wiring so far
     */
  @Test
    public void testCreate() {
        Key key = new Key();

        TransactionType type = TransactionType.CREATE;
        byte[] from = key.toAddress();
        byte[] to = Bytes.EMPTY_ADDRESS;
        Amount value = NANO_ALX.of(0);
        long nonce = as.getAccount(from).getNonce();
        long timestamp = TimeUtil.currentTimeMillis();

        // set the contract to a simple program
        String code = "608060405234801561001057600080fd5b506040516020806100e7833981018060405281019080805190602001909291905050508060008190555050609e806100496000396000f300608060405260043610603f576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680632e52d606146044575b600080fd5b348015604f57600080fd5b506056606c565b6040518082815260200191505060405180910390f35b600054815600a165627a7a72305820efb6a6369e3c5d7fe9b3274b20753bb0fe188b763fc2adee86cd844de935c8220029";
        byte[] create = HexUtil.fromHexString(code);
        byte[] data = HexUtil.fromHexString(code.substring(code.indexOf("60806040", 1)));

        AlienchainBlock bh = new AlienchainBlock(
                new BlockHeader(1l, Bytes.random(20), Bytes.random(32), System.currentTimeMillis(),
                        Bytes.random(20), Bytes.random(20), Bytes.random(20), Bytes.random(20)),
                config.vmMaxBlockGasLimit());

        long gas = 1000000;
        long gasPrice = 1;

        Transaction tx = new Transaction(network, type, to, value, Amount.ZERO, nonce, timestamp, create, gas,
                gasPrice);
        tx.sign(key);
        assertTrue(tx.validate(network));

        // insufficient available
        TransactionResult result = exec.execute(tx, as.track(), ds.track(), bh, chain);
        assertFalse(result.getCode().isSuccess());

        Amount available = ALX.of(1000);
        as.adjustAvailable(key.toAddress(), available);

        // execute but not commit
        result = exec.execute(tx, as.track(), ds.track(), bh, chain);
        assertTrue(result.getCode().isSuccess());
        assertEquals(available, as.getAccount(key.toAddress()).getAvailable());
        assertEquals(ZERO, as.getAccount(to).getAvailable());

        // execute and commit
        result = executeAndCommit(exec, tx, as.track(), ds.track(), bh);
        assertTrue(result.getCode().isSuccess());

        byte[] newContractAddress = HashUtil.calcNewAddress(tx.getFrom(), tx.getNonce());

        byte[] contract = as.getCode(newContractAddress);
        assertArrayEquals(data, contract);
    }

    private TransactionResult executeAndCommit(TransactionExecutor exec, Transaction tx, AccountState as,
            DelegateState ds, AlienchainBlock bh) {
        TransactionResult res = exec.execute(tx, as, ds, bh, chain);
        as.commit();
        ds.commit();

        return res;
    }
}
