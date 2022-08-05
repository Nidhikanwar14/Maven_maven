/*
 * This file is generated by jOOQ.
 */
package io.tntra.springBootcamp.tables;


import io.tntra.springBootcamp.FlywayTest;
import io.tntra.springBootcamp.Keys;
import io.tntra.springBootcamp.tables.records.AuthorRecord;

import java.time.LocalDate;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.16.7",
        "catalog version:_20220802",
        "schema version:flyway_test_20220802"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author extends TableImpl<AuthorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>flyway_test.author</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorRecord> getRecordType() {
        return AuthorRecord.class;
    }

    /**
     * The column <code>flyway_test.author.id</code>.
     */
    public final TableField<AuthorRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>flyway_test.author.first_name</code>.
     */
    public final TableField<AuthorRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>flyway_test.author.last_name</code>.
     */
    public final TableField<AuthorRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>flyway_test.author.date_of_birth</code>.
     */
    public final TableField<AuthorRecord, LocalDate> DATE_OF_BIRTH = createField(DSL.name("date_of_birth"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>flyway_test.author.year_of_birth</code>.
     */
    public final TableField<AuthorRecord, Integer> YEAR_OF_BIRTH = createField(DSL.name("year_of_birth"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>flyway_test.author.address</code>.
     */
    public final TableField<AuthorRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(50), this, "");

    private Author(Name alias, Table<AuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Author(Name alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>flyway_test.author</code> table reference
     */
    public Author(String alias) {
        this(DSL.name(alias), AUTHOR);
    }

    /**
     * Create an aliased <code>flyway_test.author</code> table reference
     */
    public Author(Name alias) {
        this(alias, AUTHOR);
    }

    /**
     * Create a <code>flyway_test.author</code> table reference
     */
    public Author() {
        this(DSL.name("author"), null);
    }

    public <O extends Record> Author(Table<O> child, ForeignKey<O, AuthorRecord> key) {
        super(child, key, AUTHOR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : FlywayTest.FLYWAY_TEST;
    }

    @Override
    public UniqueKey<AuthorRecord> getPrimaryKey() {
        return Keys.PK_T_AUTHOR;
    }

    @Override
    public Author as(String alias) {
        return new Author(DSL.name(alias), this);
    }

    @Override
    public Author as(Name alias) {
        return new Author(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(String name) {
        return new Author(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(Name name) {
        return new Author(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, LocalDate, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}