/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UByte;
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
public class ContractVoteWitness implements Serializable {

    private static final long serialVersionUID = 2130775151;

    private ULong  id;
    private ULong  ownerId;
    private String ownerAddress;
    private String voteAddress;
    private ULong  voteCount;
    private UByte  support;
    private ULong  transactionId;

    public ContractVoteWitness() {}

    public ContractVoteWitness(ContractVoteWitness value) {
        this.id = value.id;
        this.ownerId = value.ownerId;
        this.ownerAddress = value.ownerAddress;
        this.voteAddress = value.voteAddress;
        this.voteCount = value.voteCount;
        this.support = value.support;
        this.transactionId = value.transactionId;
    }

    public ContractVoteWitness(
        ULong  id,
        ULong  ownerId,
        String ownerAddress,
        String voteAddress,
        ULong  voteCount,
        UByte  support,
        ULong  transactionId
    ) {
        this.id = id;
        this.ownerId = ownerId;
        this.ownerAddress = ownerAddress;
        this.voteAddress = voteAddress;
        this.voteCount = voteCount;
        this.support = support;
        this.transactionId = transactionId;
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

    public UByte getSupport() {
        return this.support;
    }

    public void setSupport(UByte support) {
        this.support = support;
    }

    public ULong getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(ULong transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContractVoteWitness (");

        sb.append(id);
        sb.append(", ").append(ownerId);
        sb.append(", ").append(ownerAddress);
        sb.append(", ").append(voteAddress);
        sb.append(", ").append(voteCount);
        sb.append(", ").append(support);
        sb.append(", ").append(transactionId);

        sb.append(")");
        return sb.toString();
    }
}
