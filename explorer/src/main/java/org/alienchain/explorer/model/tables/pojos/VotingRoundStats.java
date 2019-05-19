/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.pojos;


import java.io.Serializable;

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
public class VotingRoundStats implements Serializable {

    private static final long serialVersionUID = 1551500444;

    private UInteger id;
    private String   address;
    private UInteger votingRoundId;
    private ULong    voteCount;
    private UInteger position;
    private ULong    voteLostCount;
    private Integer  positionChange;
    private Long     votesChange;

    public VotingRoundStats() {}

    public VotingRoundStats(VotingRoundStats value) {
        this.id = value.id;
        this.address = value.address;
        this.votingRoundId = value.votingRoundId;
        this.voteCount = value.voteCount;
        this.position = value.position;
        this.voteLostCount = value.voteLostCount;
        this.positionChange = value.positionChange;
        this.votesChange = value.votesChange;
    }

    public VotingRoundStats(
        UInteger id,
        String   address,
        UInteger votingRoundId,
        ULong    voteCount,
        UInteger position,
        ULong    voteLostCount,
        Integer  positionChange,
        Long     votesChange
    ) {
        this.id = id;
        this.address = address;
        this.votingRoundId = votingRoundId;
        this.voteCount = voteCount;
        this.position = position;
        this.voteLostCount = voteLostCount;
        this.positionChange = positionChange;
        this.votesChange = votesChange;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UInteger getVotingRoundId() {
        return this.votingRoundId;
    }

    public void setVotingRoundId(UInteger votingRoundId) {
        this.votingRoundId = votingRoundId;
    }

    public ULong getVoteCount() {
        return this.voteCount;
    }

    public void setVoteCount(ULong voteCount) {
        this.voteCount = voteCount;
    }

    public UInteger getPosition() {
        return this.position;
    }

    public void setPosition(UInteger position) {
        this.position = position;
    }

    public ULong getVoteLostCount() {
        return this.voteLostCount;
    }

    public void setVoteLostCount(ULong voteLostCount) {
        this.voteLostCount = voteLostCount;
    }

    public Integer getPositionChange() {
        return this.positionChange;
    }

    public void setPositionChange(Integer positionChange) {
        this.positionChange = positionChange;
    }

    public Long getVotesChange() {
        return this.votesChange;
    }

    public void setVotesChange(Long votesChange) {
        this.votesChange = votesChange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VotingRoundStats (");

        sb.append(id);
        sb.append(", ").append(address);
        sb.append(", ").append(votingRoundId);
        sb.append(", ").append(voteCount);
        sb.append(", ").append(position);
        sb.append(", ").append(voteLostCount);
        sb.append(", ").append(positionChange);
        sb.append(", ").append(votesChange);

        sb.append(")");
        return sb.toString();
    }
}