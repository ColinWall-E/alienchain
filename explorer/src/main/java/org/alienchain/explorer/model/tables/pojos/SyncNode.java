/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class SyncNode implements Serializable {

    private static final long serialVersionUID = -1787508368;

    private UInteger  id;
    private Integer   nodeId;
    private String    isValidating;
    private Timestamp ping;
    private Long      syncStartFull;
    private Long      syncEndFull;
    private Timestamp startFullDate;
    private Timestamp endFullDate;
    private Long      syncStartSolidity;
    private Long      syncEndSolidity;
    private Timestamp startSolidityDate;
    private Timestamp endSolidityDate;

    public SyncNode() {}

    public SyncNode(SyncNode value) {
        this.id = value.id;
        this.nodeId = value.nodeId;
        this.isValidating = value.isValidating;
        this.ping = value.ping;
        this.syncStartFull = value.syncStartFull;
        this.syncEndFull = value.syncEndFull;
        this.startFullDate = value.startFullDate;
        this.endFullDate = value.endFullDate;
        this.syncStartSolidity = value.syncStartSolidity;
        this.syncEndSolidity = value.syncEndSolidity;
        this.startSolidityDate = value.startSolidityDate;
        this.endSolidityDate = value.endSolidityDate;
    }

    public SyncNode(
        UInteger  id,
        Integer   nodeId,
        String    isValidating,
        Timestamp ping,
        Long      syncStartFull,
        Long      syncEndFull,
        Timestamp startFullDate,
        Timestamp endFullDate,
        Long      syncStartSolidity,
        Long      syncEndSolidity,
        Timestamp startSolidityDate,
        Timestamp endSolidityDate
    ) {
        this.id = id;
        this.nodeId = nodeId;
        this.isValidating = isValidating;
        this.ping = ping;
        this.syncStartFull = syncStartFull;
        this.syncEndFull = syncEndFull;
        this.startFullDate = startFullDate;
        this.endFullDate = endFullDate;
        this.syncStartSolidity = syncStartSolidity;
        this.syncEndSolidity = syncEndSolidity;
        this.startSolidityDate = startSolidityDate;
        this.endSolidityDate = endSolidityDate;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public Integer getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getIsValidating() {
        return this.isValidating;
    }

    public void setIsValidating(String isValidating) {
        this.isValidating = isValidating;
    }

    public Timestamp getPing() {
        return this.ping;
    }

    public void setPing(Timestamp ping) {
        this.ping = ping;
    }

    public Long getSyncStartFull() {
        return this.syncStartFull;
    }

    public void setSyncStartFull(Long syncStartFull) {
        this.syncStartFull = syncStartFull;
    }

    public Long getSyncEndFull() {
        return this.syncEndFull;
    }

    public void setSyncEndFull(Long syncEndFull) {
        this.syncEndFull = syncEndFull;
    }

    public Timestamp getStartFullDate() {
        return this.startFullDate;
    }

    public void setStartFullDate(Timestamp startFullDate) {
        this.startFullDate = startFullDate;
    }

    public Timestamp getEndFullDate() {
        return this.endFullDate;
    }

    public void setEndFullDate(Timestamp endFullDate) {
        this.endFullDate = endFullDate;
    }

    public Long getSyncStartSolidity() {
        return this.syncStartSolidity;
    }

    public void setSyncStartSolidity(Long syncStartSolidity) {
        this.syncStartSolidity = syncStartSolidity;
    }

    public Long getSyncEndSolidity() {
        return this.syncEndSolidity;
    }

    public void setSyncEndSolidity(Long syncEndSolidity) {
        this.syncEndSolidity = syncEndSolidity;
    }

    public Timestamp getStartSolidityDate() {
        return this.startSolidityDate;
    }

    public void setStartSolidityDate(Timestamp startSolidityDate) {
        this.startSolidityDate = startSolidityDate;
    }

    public Timestamp getEndSolidityDate() {
        return this.endSolidityDate;
    }

    public void setEndSolidityDate(Timestamp endSolidityDate) {
        this.endSolidityDate = endSolidityDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SyncNode (");

        sb.append(id);
        sb.append(", ").append(nodeId);
        sb.append(", ").append(isValidating);
        sb.append(", ").append(ping);
        sb.append(", ").append(syncStartFull);
        sb.append(", ").append(syncEndFull);
        sb.append(", ").append(startFullDate);
        sb.append(", ").append(endFullDate);
        sb.append(", ").append(syncStartSolidity);
        sb.append(", ").append(syncEndSolidity);
        sb.append(", ").append(startSolidityDate);
        sb.append(", ").append(endSolidityDate);

        sb.append(")");
        return sb.toString();
    }
}
