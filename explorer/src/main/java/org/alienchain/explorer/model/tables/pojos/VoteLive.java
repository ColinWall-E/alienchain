/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class VoteLive implements Serializable {

    private static final long serialVersionUID = 2046113723;

    private String  address;
    private Long    voteCount;
    private Integer position;
    private Integer positionChange;
    private Long    voteChange;

    public VoteLive() {}

    public VoteLive(VoteLive value) {
        this.address = value.address;
        this.voteCount = value.voteCount;
        this.position = value.position;
        this.positionChange = value.positionChange;
        this.voteChange = value.voteChange;
    }

    public VoteLive(
        String  address,
        Long    voteCount,
        Integer position,
        Integer positionChange,
        Long    voteChange
    ) {
        this.address = address;
        this.voteCount = voteCount;
        this.position = position;
        this.positionChange = positionChange;
        this.voteChange = voteChange;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getVoteCount() {
        return this.voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPositionChange() {
        return this.positionChange;
    }

    public void setPositionChange(Integer positionChange) {
        this.positionChange = positionChange;
    }

    public Long getVoteChange() {
        return this.voteChange;
    }

    public void setVoteChange(Long voteChange) {
        this.voteChange = voteChange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VoteLive (");

        sb.append(address);
        sb.append(", ").append(voteCount);
        sb.append(", ").append(position);
        sb.append(", ").append(positionChange);
        sb.append(", ").append(voteChange);

        sb.append(")");
        return sb.toString();
    }
}
