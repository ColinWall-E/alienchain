/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.ContractVoteWitnessVoteRecord;

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
public class ContractVoteWitnessVote extends TableImpl<ContractVoteWitnessVoteRecord> {

    private static final long serialVersionUID = 1895671492;

    /**
     * The reference instance of <code>tmp.contract_vote_witness_vote</code>
     */
    public static final ContractVoteWitnessVote CONTRACT_VOTE_WITNESS_VOTE = new ContractVoteWitnessVote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractVoteWitnessVoteRecord> getRecordType() {
        return ContractVoteWitnessVoteRecord.class;
    }

    /**
     * The column <code>tmp.contract_vote_witness_vote.id</code>.
     */
    public final TableField<ContractVoteWitnessVoteRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_witness_vote.owner_id</code>.
     */
    public final TableField<ContractVoteWitnessVoteRecord, ULong> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>tmp.contract_vote_witness_vote.owner_address</code>.
     */
    public final TableField<ContractVoteWitnessVoteRecord, String> OWNER_ADDRESS = createField("owner_address", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_witness_vote.vote_count</code>.
     */
    public final TableField<ContractVoteWitnessVoteRecord, ULong> VOTE_COUNT = createField("vote_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.contract_vote_witness_vote.vote_witness_id</code>.
     */
    public final TableField<ContractVoteWitnessVoteRecord, ULong> VOTE_WITNESS_ID = createField("vote_witness_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>tmp.contract_vote_witness_vote</code> table reference
     */
    public ContractVoteWitnessVote() {
        this("contract_vote_witness_vote", null);
    }

    /**
     * Create an aliased <code>tmp.contract_vote_witness_vote</code> table reference
     */
    public ContractVoteWitnessVote(String alias) {
        this(alias, CONTRACT_VOTE_WITNESS_VOTE);
    }

    private ContractVoteWitnessVote(String alias, Table<ContractVoteWitnessVoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractVoteWitnessVote(String alias, Table<ContractVoteWitnessVoteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ContractVoteWitnessVoteRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTRACT_VOTE_WITNESS_VOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractVoteWitnessVoteRecord> getPrimaryKey() {
        return Keys.KEY_CONTRACT_VOTE_WITNESS_VOTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractVoteWitnessVoteRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractVoteWitnessVoteRecord>>asList(Keys.KEY_CONTRACT_VOTE_WITNESS_VOTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractVoteWitnessVoteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractVoteWitnessVoteRecord, ?>>asList(Keys.FK_CONTRACT_VOTE_WITNESS_VOTE_OWNER_ID, Keys.FK_CONTRACT_VOTE_WITNESS_VOTE_VW_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractVoteWitnessVote as(String alias) {
        return new ContractVoteWitnessVote(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractVoteWitnessVote rename(String name) {
        return new ContractVoteWitnessVote(name, null);
    }
}
