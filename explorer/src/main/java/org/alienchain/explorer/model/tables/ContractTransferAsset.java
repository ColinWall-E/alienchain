/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.ContractTransferAssetRecord;

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
public class ContractTransferAsset extends TableImpl<ContractTransferAssetRecord> {

    private static final long serialVersionUID = 1336600977;

    /**
     * The reference instance of <code>tmp.contract_transfer_asset</code>
     */
    public static final ContractTransferAsset CONTRACT_TRANSFER_ASSET = new ContractTransferAsset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractTransferAssetRecord> getRecordType() {
        return ContractTransferAssetRecord.class;
    }

    /**
     * The column <code>tmp.contract_transfer_asset.id</code>.
     */
    public final TableField<ContractTransferAssetRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_transfer_asset.asset_name</code>.
     */
    public final TableField<ContractTransferAssetRecord, String> ASSET_NAME = createField("asset_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_transfer_asset.owner_id</code>.
     */
    public final TableField<ContractTransferAssetRecord, ULong> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>tmp.contract_transfer_asset.to_id</code>.
     */
    public final TableField<ContractTransferAssetRecord, ULong> TO_ID = createField("to_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>tmp.contract_transfer_asset.owner_address</code>.
     */
    public final TableField<ContractTransferAssetRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_transfer_asset.to_address</code>.
     */
    public final TableField<ContractTransferAssetRecord, String> TO_ADDRESS = createField("to_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_transfer_asset.amount</code>.
     */
    public final TableField<ContractTransferAssetRecord, ULong> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_transfer_asset.transaction_id</code>.
     */
    public final TableField<ContractTransferAssetRecord, ULong> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.contract_transfer_asset</code> table reference
     */
    public ContractTransferAsset() {
        this("contract_transfer_asset", null);
    }

    /**
     * Create an aliased <code>tmp.contract_transfer_asset</code> table reference
     */
    public ContractTransferAsset(String alias) {
        this(alias, CONTRACT_TRANSFER_ASSET);
    }

    private ContractTransferAsset(String alias, Table<ContractTransferAssetRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractTransferAsset(String alias, Table<ContractTransferAssetRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ContractTransferAssetRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTRACT_TRANSFER_ASSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractTransferAssetRecord> getPrimaryKey() {
        return Keys.KEY_CONTRACT_TRANSFER_ASSET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractTransferAssetRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractTransferAssetRecord>>asList(Keys.KEY_CONTRACT_TRANSFER_ASSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractTransferAssetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractTransferAssetRecord, ?>>asList(Keys.FK_CONTRACT_TRANSFER_ASSET_OWNER_ID, Keys.FK_CONTRACT_TRANSFER_ASSET_TO_ID, Keys.FK_CONTRACT_TRANSFER_ASSET_TX_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractTransferAsset as(String alias) {
        return new ContractTransferAsset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractTransferAsset rename(String name) {
        return new ContractTransferAsset(name, null);
    }
}
