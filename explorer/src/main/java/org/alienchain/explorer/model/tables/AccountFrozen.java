/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.AccountFrozenRecord;

import java.sql.Timestamp;
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
public class AccountFrozen extends TableImpl<AccountFrozenRecord> {

    private static final long serialVersionUID = 690744813;

    /**
     * The reference instance of <code>tmp.account_frozen</code>
     */
    public static final AccountFrozen ACCOUNT_FROZEN = new AccountFrozen();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountFrozenRecord> getRecordType() {
        return AccountFrozenRecord.class;
    }

    /**
     * The column <code>tmp.account_frozen.id</code>.
     */
    public final TableField<AccountFrozenRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.account_frozen.balance</code>.
     */
    public final TableField<AccountFrozenRecord, Long> BALANCE = createField("balance", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>tmp.account_frozen.expire_time</code>.
     */
    public final TableField<AccountFrozenRecord, Timestamp> EXPIRE_TIME = createField("expire_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>tmp.account_frozen.account_id</code>.
     */
    public final TableField<AccountFrozenRecord, ULong> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.account_frozen</code> table reference
     */
    public AccountFrozen() {
        this("account_frozen", null);
    }

    /**
     * Create an aliased <code>tmp.account_frozen</code> table reference
     */
    public AccountFrozen(String alias) {
        this(alias, ACCOUNT_FROZEN);
    }

    private AccountFrozen(String alias, Table<AccountFrozenRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountFrozen(String alias, Table<AccountFrozenRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AccountFrozenRecord, ULong> getIdentity() {
        return Keys.IDENTITY_ACCOUNT_FROZEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountFrozenRecord> getPrimaryKey() {
        return Keys.KEY_ACCOUNT_FROZEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountFrozenRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountFrozenRecord>>asList(Keys.KEY_ACCOUNT_FROZEN_PRIMARY, Keys.KEY_ACCOUNT_FROZEN_UNIQUE_BALANCE_EXPIRE_TIME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccountFrozenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountFrozenRecord, ?>>asList(Keys.FK_ACCOUNT_FROZEN_ACCOUNT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountFrozen as(String alias) {
        return new AccountFrozen(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountFrozen rename(String name) {
        return new AccountFrozen(name, null);
    }
}