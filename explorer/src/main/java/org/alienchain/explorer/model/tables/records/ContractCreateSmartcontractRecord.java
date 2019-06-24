/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.records;


import org.alienchain.explorer.model.tables.ContractCreateSmartcontract;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ContractCreateSmartcontractRecord extends UpdatableRecordImpl<ContractCreateSmartcontractRecord> implements Record3<ULong, String, ULong> {

    private static final long serialVersionUID = 1058654905;

    /**
     * Setter for <code>tmp.contract_create_smartcontract.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.contract_create_smartcontract.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.contract_create_smartcontract.owner_address</code>.
     */
    public void setOwnerAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.contract_create_smartcontract.owner_address</code>.
     */
    public String getOwnerAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tmp.contract_create_smartcontract.transaction_id</code>.
     */
    public void setTransactionId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.contract_create_smartcontract.transaction_id</code>.
     */
    public ULong getTransactionId() {
        return (ULong) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<ULong, String, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<ULong, String, ULong> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return ContractCreateSmartcontract.CONTRACT_CREATE_SMARTCONTRACT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ContractCreateSmartcontract.CONTRACT_CREATE_SMARTCONTRACT.OWNER_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return ContractCreateSmartcontract.CONTRACT_CREATE_SMARTCONTRACT.TRANSACTION_ID;
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
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractCreateSmartcontractRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractCreateSmartcontractRecord value2(String value) {
        setOwnerAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractCreateSmartcontractRecord value3(ULong value) {
        setTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractCreateSmartcontractRecord values(ULong value1, String value2, ULong value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContractCreateSmartcontractRecord
     */
    public ContractCreateSmartcontractRecord() {
        super(ContractCreateSmartcontract.CONTRACT_CREATE_SMARTCONTRACT);
    }

    /**
     * Create a detached, initialised ContractCreateSmartcontractRecord
     */
    public ContractCreateSmartcontractRecord(ULong id, String ownerAddress, ULong transactionId) {
        super(ContractCreateSmartcontract.CONTRACT_CREATE_SMARTCONTRACT);

        set(0, id);
        set(1, ownerAddress);
        set(2, transactionId);
    }
}
