/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class VotingRoundVoteLost implements Serializable {

    private static final long serialVersionUID = -541522213;

    private ULong     id;
    private UInteger  votingRoundId;
    private String    ownerAddress;
    private String    voteAddress;
    private ULong     voteCount;
    private Timestamp timestamp;

    public VotingRoundVoteLost() {}

    public VotingRoundVoteLost(VotingRoundVoteLost value) {
        this.id = value.id;
        this.votingRoundId = value.votingRoundId;
        this.ownerAddress = value.ownerAddress;
        this.voteAddress = value.voteAddress;
        this.voteCount = value.voteCount;
        this.timestamp = value.timestamp;
    }

    public VotingRoundVoteLost(
        ULong     id,
        UInteger  votingRoundId,
        String    ownerAddress,
        String    voteAddress,
        ULong     voteCount,
        Timestamp timestamp
    ) {
        this.id = id;
        this.votingRoundId = votingRoundId;
        this.ownerAddress = ownerAddress;
        this.voteAddress = voteAddress;
        this.voteCount = voteCount;
        this.timestamp = timestamp;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public UInteger getVotingRoundId() {
        return this.votingRoundId;
    }

    public void setVotingRoundId(UInteger votingRoundId) {
        this.votingRoundId = votingRoundId;
    }

    public String getOwnerAddress() {
        return this.ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getVoteAddress() {
        return this.voteAddress;
    }

    public void setVoteAddress(String voteAddress) {
        this.voteAddress = voteAddress;
    }

    public ULong getVoteCount() {
        return this.voteCount;
    }

    public void setVoteCount(ULong voteCount) {
        this.voteCount = voteCount;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VotingRoundVoteLost (");

        sb.append(id);
        sb.append(", ").append(votingRoundId);
        sb.append(", ").append(ownerAddress);
        sb.append(", ").append(voteAddress);
        sb.append(", ").append(voteCount);
        sb.append(", ").append(timestamp);

        sb.append(")");
        return sb.toString();
    }
}
