package com.acme.dao.jdbc;

import com.acme.dao.AccountDao;
import com.acme.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository("accountDao")
public class JdbcAccountDao implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcAccountDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Account createAccount(Account account){
        return account;
    }

    public String deleteAccount(Account account){
        return "deleted";
    }

    public Account modifyAccount(Account account){
        return account;
    }

}
