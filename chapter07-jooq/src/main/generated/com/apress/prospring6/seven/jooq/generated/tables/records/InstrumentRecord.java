/*
 * This file is generated by jOOQ.
 */
package com.apress.prospring6.seven.jooq.generated.tables.records;


import com.apress.prospring6.seven.jooq.generated.tables.Instrument;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InstrumentRecord extends UpdatableRecordImpl<InstrumentRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>musicdb.INSTRUMENT.INSTRUMENT_ID</code>.
     */
    public void setInstrumentId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>musicdb.INSTRUMENT.INSTRUMENT_ID</code>.
     */
    public String getInstrumentId() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Instrument.INSTRUMENT.INSTRUMENT_ID;
    }

    @Override
    public String component1() {
        return getInstrumentId();
    }

    @Override
    public String value1() {
        return getInstrumentId();
    }

    @Override
    public InstrumentRecord value1(String value) {
        setInstrumentId(value);
        return this;
    }

    @Override
    public InstrumentRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InstrumentRecord
     */
    public InstrumentRecord() {
        super(Instrument.INSTRUMENT);
    }

    /**
     * Create a detached, initialised InstrumentRecord
     */
    public InstrumentRecord(String instrumentId) {
        super(Instrument.INSTRUMENT);

        setInstrumentId(instrumentId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised InstrumentRecord
     */
    public InstrumentRecord(com.apress.prospring6.seven.jooq.generated.tables.pojos.Instrument value) {
        super(Instrument.INSTRUMENT);

        if (value != null) {
            setInstrumentId(value.getInstrumentId());
            resetChangedOnNotNull();
        }
    }
}