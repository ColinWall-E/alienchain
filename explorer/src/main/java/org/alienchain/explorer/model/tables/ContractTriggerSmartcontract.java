/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.ContractTriggerSmartcontractRecord;

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
public class ContractTriggerSmartcontract extends TableImpl<ContractTriggerSmartcontractRecord> {

    private static final long serialVersionUID = -515333990;

    /**
     * The reference instance of <code>tmp.contract_trigger_smartcontract</code>
     */
    public static final ContractTriggerSmartcontract CONTRACT_TRIGGER_SMARTCONTRACT = new ContractTriggerSmartcontract();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractTriggerSmartcontractRecord> getRecordType() {
        return ContractTriggerSmartcontractRecord.class;
    }

    /**
     * The column <code>tmp.contract_trigger_smartcontract.id</code>.
     */
    public final TableField<ContractTriggerSmartcontractRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_trigger_smartcontract.owner_address</code>.
     */
    public final TableField<ContractTriggerSmartcontractRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_trigger_smartcontract.transaction_id</code>.
     */
    public final TableField<ContractTriggerSmartcontractRecord, ULong> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.contract_trigger_smartcontract</code> table reference
     */
    public ContractTriggerSmartcontract() {
        this("contract_trigger_smartcontract", null);
    }

    /**
     * Create an aliased <code>tmp.contract_trigger_smartcontract</code> table reference
     */
    public ContractTriggerSmartcontract(String alias) {
        this(alias, CONTRACT_TRIGGER_SMARTCONTRACT);
    }

    private ContractTriggerSmartcontract(String alias, Table<ContractTriggerSmartcontractRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractTriggerSmartcontract(String alias, Table<ContractTriggerSmartcontractRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ContractTriggerSmartcontractRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTRACT_TRIGGER_SMARTCONTRACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractTriggerSmartcontractRecord> getPrimaryKey() {
        return Keys.KEY_CONTRACT_TRIGGER_SMARTCONTRACT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractTriggerSmartcontractRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractTriggerSmartcontractRecord>>asList(Keys.KEY_CONTRACT_TRIGGER_SMARTCONTRACT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractTriggerSmartcontractRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractTriggerSmartcontractRecord, ?>>asList(Keys.FK_CONTRACT_TRIGGER_SMARTCONTRACT_TX_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractTriggerSmartcontract as(String alias) {
        return new ContractTriggerSmartcontract(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractTriggerSmartcontract rename(String name) {
        return new ContractTriggerSmartcontract(name, null);
    }
}
