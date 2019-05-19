/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

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
public class ContractVoteAssetVote implements Serializable {

    private static final long serialVersionUID = -2069797300;

    private ULong  id;
    private ULong  ownerId;
    private String ownerAddress;
    private ULong  voteAssetId;

    public ContractVoteAssetVote() {}

    public ContractVoteAssetVote(ContractVoteAssetVote value) {
        this.id = value.id;
        this.ownerId = value.ownerId;
        this.ownerAddress = value.ownerAddress;
        this.voteAssetId = value.voteAssetId;
    }

    public ContractVoteAssetVote(
        ULong  id,
        ULong  ownerId,
        String ownerAddress,
        ULong  voteAssetId
    ) {
        this.id = id;
        this.ownerId = ownerId;
        this.ownerAddress = ownerAddress;
        this.voteAssetId = voteAssetId;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(ULong ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerAddress() {
        return this.ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public ULong getVoteAssetId() {
        return this.voteAssetId;
    }

    public void setVoteAssetId(ULong voteAssetId) {
        this.voteAssetId = voteAssetId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContractVoteAssetVote (");

        sb.append(id);
        sb.append(", ").append(ownerId);
        sb.append(", ").append(ownerAddress);
        sb.append(", ").append(voteAssetId);

        sb.append(")");
        return sb.toString();
    }
}