/*
 * This file is generated by jOOQ.
*/
package org.alienchain.explorer.model.tables;


import org.alienchain.explorer.model.Keys;
import org.alienchain.explorer.model.Tmp;
import org.alienchain.explorer.model.tables.records.ChartDailyRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


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
public class ChartDaily extends TableImpl<ChartDailyRecord> {

    private static final long serialVersionUID = 1535974304;

    /**
     * The reference instance of <code>tmp.chart_daily</code>
     */
    public static final ChartDaily CHART_DAILY = new ChartDaily();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChartDailyRecord> getRecordType() {
        return ChartDailyRecord.class;
    }

    /**
     * The column <code>tmp.chart_daily.id</code>.
     */
    public final TableField<ChartDailyRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.day</code>.
     */
    public final TableField<ChartDailyRecord, UShort> DAY = createField("day", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.month</code>.
     */
    public final TableField<ChartDailyRecord, UShort> MONTH = createField("month", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.year</code>.
     */
    public final TableField<ChartDailyRecord, UShort> YEAR = createField("year", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.total_tx</code>.
     */
    public final TableField<ChartDailyRecord, UInteger> TOTAL_TX = createField("total_tx", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.total_block</code>.
     */
    public final TableField<ChartDailyRecord, UInteger> TOTAL_BLOCK = createField("total_block", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.avg_block_size</code>.
     */
    public final TableField<ChartDailyRecord, UInteger> AVG_BLOCK_SIZE = createField("avg_block_size", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.avg_block_time</code>.
     */
    public final TableField<ChartDailyRecord, UInteger> AVG_BLOCK_TIME = createField("avg_block_time", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.avg_tx_count</code>.
     */
    public final TableField<ChartDailyRecord, Double> AVG_TX_COUNT = createField("avg_tx_count", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>tmp.chart_daily.avg_tx_per_second</code>.
     */
    public final TableField<ChartDailyRecord, Double> AVG_TX_PER_SECOND = createField("avg_tx_per_second", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * Create a <code>tmp.chart_daily</code> table reference
     */
    public ChartDaily() {
        this("chart_daily", null);
    }

    /**
     * Create an aliased <code>tmp.chart_daily</code> table reference
     */
    public ChartDaily(String alias) {
        this(alias, CHART_DAILY);
    }

    private ChartDaily(String alias, Table<ChartDailyRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChartDaily(String alias, Table<ChartDailyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Tmp.TMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChartDailyRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CHART_DAILY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChartDailyRecord> getPrimaryKey() {
        return Keys.KEY_CHART_DAILY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChartDailyRecord>> getKeys() {
        return Arrays.<UniqueKey<ChartDailyRecord>>asList(Keys.KEY_CHART_DAILY_PRIMARY, Keys.KEY_CHART_DAILY_DAY_MONT_YEAR_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChartDaily as(String alias) {
        return new ChartDaily(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChartDaily rename(String name) {
        return new ChartDaily(name, null);
    }
}
