/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.records;


import org.alienchain.explorer.model.tables.ContractFreezeBalance;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
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
public class ContractFreezeBalanceRecord extends UpdatableRecordImpl<ContractFreezeBalanceRecord> implements Record6<ULong, String, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = -1704008006;

    /**
     * Setter for <code>tmp.contract_freeze_balance.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.contract_freeze_balance.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.contract_freeze_balance.owner_address</code>.
     */
    public void setOwnerAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.contract_freeze_balance.owner_address</code>.
     */
    public String getOwnerAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tmp.contract_freeze_balance.frozen_balance</code>.
     */
    public void setFrozenBalance(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.contract_freeze_balance.frozen_balance</code>.
     */
    public ULong getFrozenBalance() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>tmp.contract_freeze_balance.frozen_duration</code>.
     */
    public void setFrozenDuration(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.contract_freeze_balance.frozen_duration</code>.
     */
    public ULong getFrozenDuration() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>tmp.contract_freeze_balance.transaction_id</code>.
     */
    public void setTransactionId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.contract_freeze_balance.transaction_id</code>.
     */
    public ULong getTransactionId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>tmp.contract_freeze_balance.owner_id</code>.
     */
    public void setOwnerId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.contract_freeze_balance.owner_id</code>.
     */
    public ULong getOwnerId() {
        return (ULong) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, String, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, String, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return ContractFreezeBalance.CONTRACT_FREEZE_BALANCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ContractFreezeBalance.CONTRACT_FREEZE_BALANCE.OWNER_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return ContractFreezeBalance.CONTRACT_FREEZE_BALANCE.FROZEN_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return ContractFreezeBalance.CONTRACT_FREEZE_BALANCE.FROZEN_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return ContractFreezeBalance.CONTRACT_FREEZE_BALANCE.TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return ContractFreezeBalance.CONTRACT_FREEZE_BALANCE.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOwnerAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getFrozenBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getFrozenDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractFreezeBalanceRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractFreezeBalanceRecord value2(String value) {
        setOwnerAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractFreezeBalanceRecord value3(ULong value) {
        setFrozenBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractFreezeBalanceRecord value4(ULong value) {
        setFrozenDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractFreezeBalanceRecord value5(ULong value) {
        setTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractFreezeBalanceRecord value6(ULong value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractFreezeBalanceRecord values(ULong value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContractFreezeBalanceRecord
     */
    public ContractFreezeBalanceRecord() {
        super(ContractFreezeBalance.CONTRACT_FREEZE_BALANCE);
    }

    /**
     * Create a detached, initialised ContractFreezeBalanceRecord
     */
    public ContractFreezeBalanceRecord(ULong id, String ownerAddress, ULong frozenBalance, ULong frozenDuration, ULong transactionId, ULong ownerId) {
        super(ContractFreezeBalance.CONTRACT_FREEZE_BALANCE);

        set(0, id);
        set(1, ownerAddress);
        set(2, frozenBalance);
        set(3, frozenDuration);
        set(4, transactionId);
        set(5, ownerId);
    }
}
