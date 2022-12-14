/*
 * This file is generated by jOOQ.
 */
package io.tntra.springBootcamp.tables.daos;


import io.tntra.springBootcamp.tables.Author;
import io.tntra.springBootcamp.tables.records.AuthorRecord;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class AuthorDao extends DAOImpl<AuthorRecord, io.tntra.springBootcamp.tables.pojos.Author, Integer> {

    /**
     * Create a new AuthorDao without any configuration
     */
    public AuthorDao() {
        super(Author.AUTHOR, io.tntra.springBootcamp.tables.pojos.Author.class);
    }

    /**
     * Create a new AuthorDao with an attached configuration
     */
    public AuthorDao(Configuration configuration) {
        super(Author.AUTHOR, io.tntra.springBootcamp.tables.pojos.Author.class, configuration);
    }

    @Override
    public Integer getId(io.tntra.springBootcamp.tables.pojos.Author object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Author.AUTHOR.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchById(Integer... values) {
        return fetch(Author.AUTHOR.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.tntra.springBootcamp.tables.pojos.Author fetchOneById(Integer value) {
        return fetchOne(Author.AUTHOR.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<io.tntra.springBootcamp.tables.pojos.Author> fetchOptionalById(Integer value) {
        return fetchOptional(Author.AUTHOR.ID, value);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchRangeOfFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Author.AUTHOR.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchByFirstName(String... values) {
        return fetch(Author.AUTHOR.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchRangeOfLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Author.AUTHOR.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchByLastName(String... values) {
        return fetch(Author.AUTHOR.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>date_of_birth BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchRangeOfDateOfBirth(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(Author.AUTHOR.DATE_OF_BIRTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>date_of_birth IN (values)</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchByDateOfBirth(LocalDate... values) {
        return fetch(Author.AUTHOR.DATE_OF_BIRTH, values);
    }

    /**
     * Fetch records that have <code>year_of_birth BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchRangeOfYearOfBirth(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Author.AUTHOR.YEAR_OF_BIRTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>year_of_birth IN (values)</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchByYearOfBirth(Integer... values) {
        return fetch(Author.AUTHOR.YEAR_OF_BIRTH, values);
    }

    /**
     * Fetch records that have <code>address BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchRangeOfAddress(String lowerInclusive, String upperInclusive) {
        return fetchRange(Author.AUTHOR.ADDRESS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<io.tntra.springBootcamp.tables.pojos.Author> fetchByAddress(String... values) {
        return fetch(Author.AUTHOR.ADDRESS, values);
    }
}
