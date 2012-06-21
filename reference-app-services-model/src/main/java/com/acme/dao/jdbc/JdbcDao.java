package com.acme.dao.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

public class JdbcDao {
    @Autowired
    private DataSource dataSource;

    protected NamedParameterJdbcTemplate jdbcTemplate;

    public JdbcDao() {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
}
