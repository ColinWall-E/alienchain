/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.ContractVoteAssetRecord;

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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
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
public class ContractVoteAsset extends TableImpl<ContractVoteAssetRecord> {

    private static final long serialVersionUID = -418676552;

    /**
     * The reference instance of <code>tmp.contract_vote_asset</code>
     */
    public static final ContractVoteAsset CONTRACT_VOTE_ASSET = new ContractVoteAsset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractVoteAssetRecord> getRecordType() {
        return ContractVoteAssetRecord.class;
    }

    /**
     * The column <code>tmp.contract_vote_asset.id</code>.
     */
    public final TableField<ContractVoteAssetRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_asset.owner_id</code>.
     */
    public final TableField<ContractVoteAssetRecord, ULong> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>tmp.contract_vote_asset.transaction_id</code>.
     */
    public final TableField<ContractVoteAssetRecord, ULong> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_asset.support</code>.
     */
    public final TableField<ContractVoteAssetRecord, UByte> SUPPORT = createField("support", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_asset.count</code>.
     */
    public final TableField<ContractVoteAssetRecord, UInteger> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_asset.owner_address</code>.
     */
    public final TableField<ContractVoteAssetRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_asset.vote_to_address</code>.
     */
    public final TableField<ContractVoteAssetRecord, String> VOTE_TO_ADDRESS = createField("vote_to_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * Create a <code>tmp.contract_vote_asset</code> table reference
     */
    public ContractVoteAsset() {
        this("contract_vote_asset", null);
    }

    /**
     * Create an aliased <code>tmp.contract_vote_asset</code> table reference
     */
    public ContractVoteAsset(String alias) {
        this(alias, CONTRACT_VOTE_ASSET);
    }

    private ContractVoteAsset(String alias, Table<ContractVoteAssetRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractVoteAsset(String alias, Table<ContractVoteAssetRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ContractVoteAssetRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTRACT_VOTE_ASSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractVoteAssetRecord> getPrimaryKey() {
        return Keys.KEY_CONTRACT_VOTE_ASSET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractVoteAssetRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractVoteAssetRecord>>asList(Keys.KEY_CONTRACT_VOTE_ASSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractVoteAssetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractVoteAssetRecord, ?>>asList(Keys.FK_CONTRACT_VOTE_ASSET_OWNER_ID, Keys.FK_CONTRACT_VOTE_ASSET_TX_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractVoteAsset as(String alias) {
        return new ContractVoteAsset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractVoteAsset rename(String name) {
        return new ContractVoteAsset(name, null);
    }
}
