/**
 * Copyright (c) 2017-2018 The Alienchain Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.alienchain.core;

import static org.alienchain.core.Amount.ZERO;
import static org.alienchain.core.Amount.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.alienchain.Network;
import org.alienchain.config.Config;
import org.alienchain.crypto.Hex;
import org.alienchain.crypto.Key.Signature;
import org.alienchain.util.MerkleUtil;
import org.alienchain.util.SimpleDecoder;
import org.alienchain.util.SimpleEncoder;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a block in the blockchain.
 */
public class Block {

    public enum BlockPart {
        HEADER(1 << 0), TRANSACTIONS(1 << 1), RECEIPTS(1 << 2), VOTES(1 << 3);

        private int code;

        BlockPart(int code) {
            this.code = code;
        }

        public static int parts(BlockPart... parts) {
            int result = 0;
            for (BlockPart part : parts) {
                result |= part.code;
            }
            return result;
        }

        public List<BlockPart> parts(int parts) {
            List<BlockPart> result = new ArrayList<>();
            // NOTE: values() returns an array containing all of the values of the enum type
            // in the order they are declared.
            for (BlockPart bp : BlockPart.values()) {
                if ((parts & bp.code) != 0) {
                    result.add(bp);
                }
            }

            return result;
        }
    }

    static final Logger logger = LoggerFactory.getLogger(Block.class);

    /**
     * The block header.
     */
    private final BlockHeader header;

    /**
     * The transactions.
     */
    private final List<Transaction> transactions;

    /**
     * The transaction results.
     */
    private List<TransactionResult> results;

    /**
     * The BFT view and votes.
     */
    private int view;
    private List<Signature> votes;

    // =========================
    // Auxiliary data
    // =========================

    /**
     * Create a new block.
     *
     * @param header
     *            a signed block header
     * @param transactions
     *            list of transaction
     * @param results
     *            list of transaction results
     * @param view
     *            BFT view
     * @param votes
     *            BFT validator votes
     */
    public Block(BlockHeader header, List<Transaction> transactions, List<TransactionResult> results, int view,
            List<Signature> votes) {
        this.header = header;

        this.transactions = transactions;
        this.results = results;

        this.view = view;
        this.votes = votes;
    }

    public Block(BlockHeader header, List<Transaction> transactions) {
        this(header, transactions, new ArrayList<>(), 0, new ArrayList<>());
    }

    public Block(BlockHeader header, List<Transaction> transactions, List<TransactionResult> results) {
        this(header, transactions, results, 0, new ArrayList<>());
    }

    public void setResults(List<TransactionResult> results) {
        this.results = results;
    }

    public void setView(int view) {
        this.view = view;
    }

    public void setVotes(List<Signature> votes) {
        this.votes = votes;
    }

    /**
     * Validates block header.
     *
     * @param header
     * @param previous
     * @return
     */
    public boolean validateHeader(BlockHeader previous, BlockHeader header) {
        if (header == null) {
            logger.warn("Header was null.");
            return false;
        }

        if (!header.validate()) {
            logger.warn("Header was invalid.");
            return false;
        }

        if (header.getNumber() != previous.getNumber() + 1) {
            logger.warn("Header number was not one greater than previous block.");
            return false;
        }

        if (!Arrays.equals(header.getParentHash(), previous.getHash())) {
            logger.warn("Header parent hash was not equal to previous block hash.");
            return false;
        }

        if (header.getTimestamp() <= previous.getTimestamp()) {
            logger.warn("Header timestamp was before previous block.");
            return false;
        }

        return true;
    }

    /**
     * Validates transactions in parallel.
     *
     * @param header
     * @param transactions
     * @param network
     * @return
     */
    public boolean validateTransactions(BlockHeader header, List<Transaction> transactions, Network network) {
        return validateTransactions(header, transactions, transactions, network);
    }

    /**
     * Validates transactions in parallel, only doing those that have not already
     * been calculated.
     *
     * @param header
     *            block header
     * @param unvalidatedTransactions
     *            transactions needing validating
     * @param allTransactions
     *            all transactions within the block
     * @param network
     *            network
     * @return
     */
    public boolean validateTransactions(BlockHeader header, Collection<Transaction> unvalidatedTransactions,
            List<Transaction> allTransactions, Network network) {
        // validate transactions
        boolean valid = unvalidatedTransactions.parallelStream().allMatch(tx -> tx.validate(network));
        if (!valid) {
            return false;
        }

        // validate transactions root
        byte[] root = MerkleUtil.computeTransactionsRoot(allTransactions);
        return Arrays.equals(root, header.getTransactionsRoot());
    }

    /**
     * Validates results.
     *
     * @param header
     * @param results
     * @return
     */
    public boolean validateResults(BlockHeader header, List<TransactionResult> results) {
        // validate results
        for (TransactionResult result : results) {
            if (result.getCode().isRejected()) {
                logger.warn("Transaction result does not match for " + result.toString());
                return false;
            }
        }

        // validate results root
        byte[] root = MerkleUtil.computeResultsRoot(results);
        boolean rootMatches = Arrays.equals(root, header.getResultsRoot());
        if (!rootMatches) {
            logger.warn("Merkle root does not match expected");
        }
        return rootMatches;
    }

    public static Amount getBlockReward(Block block, Config config) {

        Amount txsReward = block.getTransactions().stream().map(Transaction::getFee).reduce(ZERO, Amount::sum);
        Amount gasReward = getGasReward(block);
        Amount reward = sum(sum(config.getBlockReward(block.getNumber()), txsReward), gasReward);

        return reward;
    }

    /**
     * Retrieve the total gas award for the block
     *
     * @param block
     * @return
     */
    private static Amount getGasReward(Block block) {
        List<Transaction> transactions = block.getTransactions();
        List<TransactionResult> results = block.getResults();
        long sum = 0;
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            TransactionResult result = results.get(i);
            sum += (transaction.getGasPrice() * result.getGasUsed());
        }
        return Amount.Unit.NANO_ALX.of(sum);
    }

    /**
     * Returns a shallow copy of the block header.
     *
     * @return
     */
    public BlockHeader getHeader() {
        return header;
    }

    /**
     * Returns a shallow copy of the transactions.
     *
     * @return
     */
    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    /**
     * Returns a shallow copy of the transactions results.
     *
     * @return
     */
    public List<TransactionResult> getResults() {
        return new ArrayList<>(results);
    }

    /**
     * Returns the BFT view.
     *
     * @return
     */
    public int getView() {
        return view;
    }

    /**
     * Returns a shallow copy of the votes.
     *
     * @return
     */
    public List<Signature> getVotes() {
        return new ArrayList<>(votes);
    }

    /**
     * Returns the block hash.
     *
     * @return
     */
    public byte[] getHash() {
        return header.getHash();
    }

    /**
     * Returns the block number.
     *
     * @return
     */
    public long getNumber() {
        return header.getNumber();
    }

    /**
     * Returns the coinbase
     *
     * @return
     */
    public byte[] getCoinbase() {
        return header.getCoinbase();
    }

    /**
     * Returns the hash of the parent block
     *
     * @return
     */
    public byte[] getParentHash() {
        return header.getParentHash();
    }

    /**
     * Returns the block timestamp.
     *
     * @return
     */
    public long getTimestamp() {
        return header.getTimestamp();
    }

    /**
     * Returns the merkle root of all transactions.
     *
     * @return
     */
    public byte[] getTransactionsRoot() {
        return header.getTransactionsRoot();
    }

    /**
     * Returns the merkle root of all transaction results.
     *
     * @return
     */
    public byte[] getResultsRoot() {
        return header.getResultsRoot();
    }

    /**
     * Returns the state root.
     *
     * @return
     */
    public byte[] getStateRoot() {
        return header.getStateRoot();
    }

    /**
     * Returns the extra data.
     *
     * @return
     */
    public byte[] getData() {
        return header.getData();
    }

    /**
     * Serializes the block header into byte array.
     *
     * @return
     */
    public byte[] getEncodedHeader() {
        return header.toBytes();
    }

    /**
     * Serializes the block transactions into byte array.
     *
     * @return
     */
    public byte[] getEncodedTransactions() {
        return getEncodedTransactionsAndIndices().getLeft();
    }

    public Pair<byte[], List<Integer>> getEncodedTransactionsAndIndices() {
        List<Integer> indices = new ArrayList<>();

        SimpleEncoder enc = new SimpleEncoder();
        enc.writeInt(transactions.size());
        for (int i = 0; i < transactions.size(); i++) {
            int index = enc.getWriteIndex();
            enc.writeBytes(transactions.get(i).toBytes());
            indices.add(index);
        }

        return Pair.of(enc.toBytes(), indices);
    }

    /**
     * Serializes the block transactions results into byte array.
     *
     * @return
     */
    public byte[] getEncodedResults() {
        return getEncodedResultsAndIndex().getLeft();
    }

    public Pair<byte[], List<Integer>> getEncodedResultsAndIndex() {
        List<Integer> indices = new ArrayList<>();

        SimpleEncoder enc = new SimpleEncoder();
        enc.writeInt(results.size());
        for (int i = 0; i < results.size(); i++) {
            int index = enc.getWriteIndex();
            enc.writeBytes(results.get(i).toBytes());
            indices.add(index);
        }

        return Pair.of(enc.toBytes(), indices);
    }

    /**
     * Serializes the BFT votes into byte array.
     *
     * @return
     */
    public byte[] getEncodedVotes() {
        SimpleEncoder enc = new SimpleEncoder();

        enc.writeInt(view);
        enc.writeInt(votes.size());
        for (Signature vote : votes) {
            enc.writeBytes(vote.toBytes());
        }

        return enc.toBytes();
    }

    /**
     * Parses a block instance from bytes.
     *
     * @param h
     *            Serialized header
     * @param t
     *            Serialized transactions
     * @param r
     *            Serialized transaction results
     * @param v
     *            Serialized votes
     * @return
     */
    public static Block fromComponents(byte[] h, byte[] t, byte[] r, byte[] v) {
        if (h == null) {
            throw new IllegalArgumentException("Block header can't be null");
        }
        if (t == null) {
            throw new IllegalArgumentException("Block transactions can't be null");
        }

        BlockHeader header = BlockHeader.fromBytes(h);

        SimpleDecoder dec = new SimpleDecoder(t);
        List<Transaction> transactions = new ArrayList<>();
        int n = dec.readInt();
        for (int i = 0; i < n; i++) {
            transactions.add(Transaction.fromBytes(dec.readBytes()));
        }

        List<TransactionResult> results = new ArrayList<>();
        if (r != null) {
            dec = new SimpleDecoder(r);
            n = dec.readInt();
            for (int i = 0; i < n; i++) {
                results.add(TransactionResult.fromBytes(dec.readBytes()));
            }
        }

        int view = 0;
        List<Signature> votes = new ArrayList<>();
        if (v != null) {
            dec = new SimpleDecoder(v);
            view = dec.readInt();
            n = dec.readInt();
            for (int i = 0; i < n; i++) {
                votes.add(Signature.fromBytes(dec.readBytes()));
            }
        }

        return new Block(header, transactions, results, view, votes);
    }

    public byte[] toBytes() {
        SimpleEncoder enc = new SimpleEncoder();
        enc.writeBytes(getEncodedHeader());
        enc.writeBytes(getEncodedTransactions());
        enc.writeBytes(getEncodedResults());
        enc.writeBytes(getEncodedVotes());

        return enc.toBytes();
    }

    public static Block fromBytes(byte[] bytes) {
        SimpleDecoder dec = new SimpleDecoder(bytes);
        byte[] header = dec.readBytes();
        byte[] transactions = dec.readBytes();
        byte[] results = dec.readBytes();
        byte[] votes = dec.readBytes();

        return Block.fromComponents(header, transactions, results, votes);
    }

    /**
     * Get block size in bytes
     *
     * @return block size in bytes
     */
    public int size() {
        return toBytes().length;
    }

    @Override
    public String toString() {
        return "Block [number = " + getNumber() + ", view = " + getView() + ", hash = " + Hex.encode(getHash())
                + ", # txs = " + transactions.size() + ", # votes = " + votes.size() + "]";
    }

}
