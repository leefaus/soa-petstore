package com.acme.dao.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcDao {
    @Autowired
    private DataSource dataSource;

    protected JdbcTemplate jdbcTemplate;

    public JdbcDao() {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
