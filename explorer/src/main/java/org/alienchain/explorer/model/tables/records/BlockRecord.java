/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables.records;


import org.alienchain.explorer.model.tables.Block;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
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
public class BlockRecord extends UpdatableRecordImpl<BlockRecord> implements Record12<ULong, ULong, String, String, String, UInteger, Timestamp, UInteger, ULong, String, UInteger, Byte> {

    private static final long serialVersionUID = 1246422028;

    /**
     * Setter for <code>tmp.block.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.block.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.block.num</code>.
     */
    public void setNum(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.block.num</code>.
     */
    public ULong getNum() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>tmp.block.hash</code>.
     */
    public void setHash(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.block.hash</code>.
     */
    public String getHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tmp.block.parent_hash</code>.
     */
    public void setParentHash(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.block.parent_hash</code>.
     */
    public String getParentHash() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tmp.block.txTrieRoot</code>.
     */
    public void setTxtrieroot(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.block.txTrieRoot</code>.
     */
    public String getTxtrieroot() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tmp.block.tx_count</code>.
     */
    public void setTxCount(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.block.tx_count</code>.
     */
    public UInteger getTxCount() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>tmp.block.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>tmp.block.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>tmp.block.size</code>.
     */
    public void setSize(UInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>tmp.block.size</code>.
     */
    public UInteger getSize() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>tmp.block.witness_id</code>.
     */
    public void setWitnessId(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>tmp.block.witness_id</code>.
     */
    public ULong getWitnessId() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>tmp.block.witness_address</code>.
     */
    public void setWitnessAddress(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>tmp.block.witness_address</code>.
     */
    public String getWitnessAddress() {
        return (String) get(9);
    }

    /**
     * Setter for <code>tmp.block.block_time</code>.
     */
    public void setBlockTime(UInteger value) {
        set(10, value);
    }

    /**
     * Getter for <code>tmp.block.block_time</code>.
     */
    public UInteger getBlockTime() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>tmp.block.confirmed</code>.
     */
    public void setConfirmed(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>tmp.block.confirmed</code>.
     */
    public Byte getConfirmed() {
        return (Byte) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, ULong, String, String, String, UInteger, Timestamp, UInteger, ULong, String, UInteger, Byte> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, ULong, String, String, String, UInteger, Timestamp, UInteger, ULong, String, UInteger, Byte> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Block.BLOCK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return Block.BLOCK.NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Block.BLOCK.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Block.BLOCK.PARENT_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Block.BLOCK.TXTRIEROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return Block.BLOCK.TX_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Block.BLOCK.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field8() {
        return Block.BLOCK.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return Block.BLOCK.WITNESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Block.BLOCK.WITNESS_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field11() {
        return Block.BLOCK.BLOCK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return Block.BLOCK.CONFIRMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getParentHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTxtrieroot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getTxCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value8() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getWitnessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getWitnessAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value11() {
        return getBlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getConfirmed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value2(ULong value) {
        setNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value3(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value4(String value) {
        setParentHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value5(String value) {
        setTxtrieroot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value6(UInteger value) {
        setTxCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value7(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value8(UInteger value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value9(ULong value) {
        setWitnessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value10(String value) {
        setWitnessAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value11(UInteger value) {
        setBlockTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value12(Byte value) {
        setConfirmed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord values(ULong value1, ULong value2, String value3, String value4, String value5, UInteger value6, Timestamp value7, UInteger value8, ULong value9, String value10, UInteger value11, Byte value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlockRecord
     */
    public BlockRecord() {
        super(Block.BLOCK);
    }

    /**
     * Create a detached, initialised BlockRecord
     */
    public BlockRecord(ULong id, ULong num, String hash, String parentHash, String txtrieroot, UInteger txCount, Timestamp timestamp, UInteger size, ULong witnessId, String witnessAddress, UInteger blockTime, Byte confirmed) {
        super(Block.BLOCK);

        set(0, id);
        set(1, num);
        set(2, hash);
        set(3, parentHash);
        set(4, txtrieroot);
        set(5, txCount);
        set(6, timestamp);
        set(7, size);
        set(8, witnessId);
        set(9, witnessAddress);
        set(10, blockTime);
        set(11, confirmed);
    }
}
