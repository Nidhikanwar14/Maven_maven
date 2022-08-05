/*
 * This file is generated by jOOQ.
 */
package io.tntra.springBootcamp.tables.records;


import io.tntra.springBootcamp.tables.Author;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(
    name = "author",
    schema = "flyway_test"
)
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord> implements Record6<Integer, String, String, LocalDate, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>flyway_test.author.id</code>.
     */
    public AuthorRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.author.id</code>.
     */
    @Id
    @Column(name = "id", nullable = false, precision = 32)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>flyway_test.author.first_name</code>.
     */
    public AuthorRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.author.first_name</code>.
     */
    @Column(name = "first_name", length = 50)
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>flyway_test.author.last_name</code>.
     */
    public AuthorRecord setLastName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.author.last_name</code>.
     */
    @Column(name = "last_name", nullable = false, length = 50)
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>flyway_test.author.date_of_birth</code>.
     */
    public AuthorRecord setDateOfBirth(LocalDate value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.author.date_of_birth</code>.
     */
    @Column(name = "date_of_birth")
    public LocalDate getDateOfBirth() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>flyway_test.author.year_of_birth</code>.
     */
    public AuthorRecord setYearOfBirth(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.author.year_of_birth</code>.
     */
    @Column(name = "year_of_birth", precision = 32)
    public Integer getYearOfBirth() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>flyway_test.author.address</code>.
     */
    public AuthorRecord setAddress(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>flyway_test.author.address</code>.
     */
    @Column(name = "address", length = 50)
    public String getAddress() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, LocalDate, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, LocalDate, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Author.AUTHOR.ID;
    }

    @Override
    public Field<String> field2() {
        return Author.AUTHOR.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Author.AUTHOR.LAST_NAME;
    }

    @Override
    public Field<LocalDate> field4() {
        return Author.AUTHOR.DATE_OF_BIRTH;
    }

    @Override
    public Field<Integer> field5() {
        return Author.AUTHOR.YEAR_OF_BIRTH;
    }

    @Override
    public Field<String> field6() {
        return Author.AUTHOR.ADDRESS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public LocalDate component4() {
        return getDateOfBirth();
    }

    @Override
    public Integer component5() {
        return getYearOfBirth();
    }

    @Override
    public String component6() {
        return getAddress();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public LocalDate value4() {
        return getDateOfBirth();
    }

    @Override
    public Integer value5() {
        return getYearOfBirth();
    }

    @Override
    public String value6() {
        return getAddress();
    }

    @Override
    public AuthorRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AuthorRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public AuthorRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public AuthorRecord value4(LocalDate value) {
        setDateOfBirth(value);
        return this;
    }

    @Override
    public AuthorRecord value5(Integer value) {
        setYearOfBirth(value);
        return this;
    }

    @Override
    public AuthorRecord value6(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public AuthorRecord values(Integer value1, String value2, String value3, LocalDate value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorRecord
     */
    public AuthorRecord() {
        super(Author.AUTHOR);
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    public AuthorRecord(Integer id, String firstName, String lastName, LocalDate dateOfBirth, Integer yearOfBirth, String address) {
        super(Author.AUTHOR);

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setYearOfBirth(yearOfBirth);
        setAddress(address);
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    public AuthorRecord(io.tntra.springBootcamp.tables.pojos.Author value) {
        super(Author.AUTHOR);

        if (value != null) {
            setId(value.getId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setDateOfBirth(value.getDateOfBirth());
            setYearOfBirth(value.getYearOfBirth());
            setAddress(value.getAddress());
        }
    }
}