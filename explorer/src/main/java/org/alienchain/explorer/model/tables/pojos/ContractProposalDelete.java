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
public class ContractProposalDelete implements Serializable {

    private static final long serialVersionUID = 926252854;

    private ULong  id;
    private String ownerAddress;
    private ULong  transactionId;

    public ContractProposalDelete() {}

    public ContractProposalDelete(ContractProposalDelete value) {
        this.id = value.id;
        this.ownerAddress = value.ownerAddress;
        this.transactionId = value.transactionId;
    }

    public ContractProposalDelete(
        ULong  id,
        String ownerAddress,
        ULong  transactionId
    ) {
        this.id = id;
        this.ownerAddress = ownerAddress;
        this.transactionId = transactionId;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public String getOwnerAddress() {
        return this.ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public ULong getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(ULong transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContractProposalDelete (");

        sb.append(id);
        sb.append(", ").append(ownerAddress);
        sb.append(", ").append(transactionId);

        sb.append(")");
        return sb.toString();
    }
}
