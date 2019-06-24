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
public class ContractParticipateAssetIssue implements Serializable {

    private static final long serialVersionUID = 856397804;

    private ULong  id;
    private ULong  ownerId;
    private String ownerAddress;
    private ULong  toId;
    private String toAddress;
    private String assetName;
    private ULong  amount;
    private ULong  transactionId;

    public ContractParticipateAssetIssue() {}

    public ContractParticipateAssetIssue(ContractParticipateAssetIssue value) {
        this.id = value.id;
        this.ownerId = value.ownerId;
        this.ownerAddress = value.ownerAddress;
        this.toId = value.toId;
        this.toAddress = value.toAddress;
        this.assetName = value.assetName;
        this.amount = value.amount;
        this.transactionId = value.transactionId;
    }

    public ContractParticipateAssetIssue(
        ULong  id,
        ULong  ownerId,
        String ownerAddress,
        ULong  toId,
        String toAddress,
        String assetName,
        ULong  amount,
        ULong  transactionId
    ) {
        this.id = id;
        this.ownerId = ownerId;
        this.ownerAddress = ownerAddress;
        this.toId = toId;
        this.toAddress = toAddress;
        this.assetName = assetName;
        this.amount = amount;
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

    public ULong getToId() {
        return this.toId;
    }

    public void setToId(ULong toId) {
        this.toId = toId;
    }

    public String getToAddress() {
        return this.toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getAssetName() {
        return this.assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ULong getAmount() {
        return this.amount;
    }

    public void setAmount(ULong amount) {
        this.amount = amount;
    }

    public ULong getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(ULong transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContractParticipateAssetIssue (");

        sb.append(id);
        sb.append(", ").append(ownerId);
        sb.append(", ").append(ownerAddress);
        sb.append(", ").append(toId);
        sb.append(", ").append(toAddress);
        sb.append(", ").append(assetName);
        sb.append(", ").append(amount);
        sb.append(", ").append(transactionId);

        sb.append(")");
        return sb.toString();
    }
}
