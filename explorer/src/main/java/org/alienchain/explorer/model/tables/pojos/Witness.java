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
public class Witness implements Serializable {

    private static final long serialVersionUID = 671392626;

    private ULong  id;
    private ULong  voteCount;
    private String url;
    private ULong  totalProduced;
    private ULong  totalMissed;
    private ULong  latestBlockNum;
    private Long   latestSlotNum;
    private Byte   isjobs;
    private ULong  accountId;
    private String address;

    public Witness() {}

    public Witness(Witness value) {
        this.id = value.id;
        this.voteCount = value.voteCount;
        this.url = value.url;
        this.totalProduced = value.totalProduced;
        this.totalMissed = value.totalMissed;
        this.latestBlockNum = value.latestBlockNum;
        this.latestSlotNum = value.latestSlotNum;
        this.isjobs = value.isjobs;
        this.accountId = value.accountId;
        this.address = value.address;
    }

    public Witness(
        ULong  id,
        ULong  voteCount,
        String url,
        ULong  totalProduced,
        ULong  totalMissed,
        ULong  latestBlockNum,
        Long   latestSlotNum,
        Byte   isjobs,
        ULong  accountId,
        String address
    ) {
        this.id = id;
        this.voteCount = voteCount;
        this.url = url;
        this.totalProduced = totalProduced;
        this.totalMissed = totalMissed;
        this.latestBlockNum = latestBlockNum;
        this.latestSlotNum = latestSlotNum;
        this.isjobs = isjobs;
        this.accountId = accountId;
        this.address = address;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getVoteCount() {
        return this.voteCount;
    }

    public void setVoteCount(ULong voteCount) {
        this.voteCount = voteCount;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ULong getTotalProduced() {
        return this.totalProduced;
    }

    public void setTotalProduced(ULong totalProduced) {
        this.totalProduced = totalProduced;
    }

    public ULong getTotalMissed() {
        return this.totalMissed;
    }

    public void setTotalMissed(ULong totalMissed) {
        this.totalMissed = totalMissed;
    }

    public ULong getLatestBlockNum() {
        return this.latestBlockNum;
    }

    public void setLatestBlockNum(ULong latestBlockNum) {
        this.latestBlockNum = latestBlockNum;
    }

    public Long getLatestSlotNum() {
        return this.latestSlotNum;
    }

    public void setLatestSlotNum(Long latestSlotNum) {
        this.latestSlotNum = latestSlotNum;
    }

    public Byte getIsjobs() {
        return this.isjobs;
    }

    public void setIsjobs(Byte isjobs) {
        this.isjobs = isjobs;
    }

    public ULong getAccountId() {
        return this.accountId;
    }

    public void setAccountId(ULong accountId) {
        this.accountId = accountId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Witness (");

        sb.append(id);
        sb.append(", ").append(voteCount);
        sb.append(", ").append(url);
        sb.append(", ").append(totalProduced);
        sb.append(", ").append(totalMissed);
        sb.append(", ").append(latestBlockNum);
        sb.append(", ").append(latestSlotNum);
        sb.append(", ").append(isjobs);
        sb.append(", ").append(accountId);
        sb.append(", ").append(address);

        sb.append(")");
        return sb.toString();
    }
}