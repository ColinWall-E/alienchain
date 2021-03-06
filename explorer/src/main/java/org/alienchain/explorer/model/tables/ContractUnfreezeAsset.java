/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.ContractUnfreezeAssetRecord;

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
public class ContractUnfreezeAsset extends TableImpl<ContractUnfreezeAssetRecord> {

    private static final long serialVersionUID = 766021969;

    /**
     * The reference instance of <code>tmp.contract_unfreeze_asset</code>
     */
    public static final ContractUnfreezeAsset CONTRACT_UNFREEZE_ASSET = new ContractUnfreezeAsset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractUnfreezeAssetRecord> getRecordType() {
        return ContractUnfreezeAssetRecord.class;
    }

    /**
     * The column <code>tmp.contract_unfreeze_asset.id</code>.
     */
    public final TableField<ContractUnfreezeAssetRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_unfreeze_asset.owner_address</code>.
     */
    public final TableField<ContractUnfreezeAssetRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_unfreeze_asset.transaction_id</code>.
     */
    public final TableField<ContractUnfreezeAssetRecord, ULong> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.contract_unfreeze_asset</code> table reference
     */
    public ContractUnfreezeAsset() {
        this("contract_unfreeze_asset", null);
    }

    /**
     * Create an aliased <code>tmp.contract_unfreeze_asset</code> table reference
     */
    public ContractUnfreezeAsset(String alias) {
        this(alias, CONTRACT_UNFREEZE_ASSET);
    }

    private ContractUnfreezeAsset(String alias, Table<ContractUnfreezeAssetRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractUnfreezeAsset(String alias, Table<ContractUnfreezeAssetRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ContractUnfreezeAssetRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTRACT_UNFREEZE_ASSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractUnfreezeAssetRecord> getPrimaryKey() {
        return Keys.KEY_CONTRACT_UNFREEZE_ASSET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractUnfreezeAssetRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractUnfreezeAssetRecord>>asList(Keys.KEY_CONTRACT_UNFREEZE_ASSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractUnfreezeAssetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractUnfreezeAssetRecord, ?>>asList(Keys.FK_CONTRACT_UNFREEZE_ASSET_TX_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractUnfreezeAsset as(String alias) {
        return new ContractUnfreezeAsset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractUnfreezeAsset rename(String name) {
        return new ContractUnfreezeAsset(name, null);
    }
}
