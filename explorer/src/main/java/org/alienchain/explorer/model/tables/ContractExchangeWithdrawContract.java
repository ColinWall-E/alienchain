/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.ContractExchangeWithdrawContractRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContractExchangeWithdrawContract extends TableImpl<ContractExchangeWithdrawContractRecord> {

    private static final long serialVersionUID = -1060870553;

    /**
     * The reference instance of <code>tmp.contract_exchange_withdraw_contract</code>
     */
    public static final ContractExchangeWithdrawContract CONTRACT_EXCHANGE_WITHDRAW_CONTRACT = new ContractExchangeWithdrawContract();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractExchangeWithdrawContractRecord> getRecordType() {
        return ContractExchangeWithdrawContractRecord.class;
    }

    /**
     * The column <code>tmp.contract_exchange_withdraw_contract.id</code>.
     */
    public final TableField<ContractExchangeWithdrawContractRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_exchange_withdraw_contract.owner_address</code>.
     */
    public final TableField<ContractExchangeWithdrawContractRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_exchange_withdraw_contract.transaction_id</code>.
     */
    public final TableField<ContractExchangeWithdrawContractRecord, ULong> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.contract_exchange_withdraw_contract</code> table reference
     */
    public ContractExchangeWithdrawContract() {
        this("contract_exchange_withdraw_contract", null);
    }

    /**
     * Create an aliased <code>tmp.contract_exchange_withdraw_contract</code> table reference
     */
    public ContractExchangeWithdrawContract(String alias) {
        this(alias, CONTRACT_EXCHANGE_WITHDRAW_CONTRACT);
    }

    private ContractExchangeWithdrawContract(String alias, Table<ContractExchangeWithdrawContractRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractExchangeWithdrawContract(String alias, Table<ContractExchangeWithdrawContractRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Tmp.TMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContractExchangeWithdrawContractRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTRACT_EXCHANGE_WITHDRAW_CONTRACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractExchangeWithdrawContractRecord> getPrimaryKey() {
        return Keys.KEY_CONTRACT_EXCHANGE_WITHDRAW_CONTRACT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractExchangeWithdrawContractRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractExchangeWithdrawContractRecord>>asList(Keys.KEY_CONTRACT_EXCHANGE_WITHDRAW_CONTRACT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractExchangeWithdrawContractRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractExchangeWithdrawContractRecord, ?>>asList(Keys.FK_CONTRACT_EXCHANGE_WITHDRAW_CONTRACT_TX_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractExchangeWithdrawContract as(String alias) {
        return new ContractExchangeWithdrawContract(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractExchangeWithdrawContract rename(String name) {
        return new ContractExchangeWithdrawContract(name, null);
    }
}
