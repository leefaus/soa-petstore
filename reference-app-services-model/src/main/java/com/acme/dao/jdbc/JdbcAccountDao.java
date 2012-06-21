package com.acme.dao.jdbc;

import com.acme.dao.AccountDao;
import com.acme.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository("accountDao")
public class JdbcAccountDao extends JdbcDaoSupport implements AccountDao {
    @Autowired
    public JdbcAccountDao(DataSource dataSource) {
        setDataSource(dataSource);
    }

    private static final String CREATE_ACCOUNT = "INSERT INTO ACCOUNT  (accountId, userName, lastName, firstName, emailAddress, homePhone, cellPhone)"
            + " values ?, ?, ?, ?, ?, ?, ?";
    private static final String DELETE_ACCOUNT = "DELETE FROM ACCOUNT WHERE accountId = ?";
    private static final String MODIFY_ACCOUNT = "UPDATE ACCOUNT SET accountId = ?, " +
            "                                                       userName = ?, " +
            "                                                       lastName = ?, " +
            "                                                       firstName = ?, " +
            "                                                       emailAddress = ?, " +
            "                                                       homePhone = ?, " +
            "                                                       cellPhone= ? " +
            "                                                       WHERE accountId = ?";

    public Account createAccount(Account account) {

        getJdbcTemplate().update(CREATE_ACCOUNT,
                account.getAccountId(),
                account.getUserName(),
                account.getUserName(),
                account.getLastName(),
                account.getFirstName(),
                account.getEmailAddress(),
                account.getHomePhone(),
                account.getCellPhone(),
                account.getAccountId());
        return account;
    }

    public String deleteAccount(Account account) {
        getJdbcTemplate().update(DELETE_ACCOUNT, account.getAccountId());
        return "deleted";
    }

    public Account modifyAccount(Account account) {
        getJdbcTemplate().update(MODIFY_ACCOUNT,
                account.getAccountId(),
                account.getUserName(),
                account.getUserName(),
                account.getLastName(),
                account.getFirstName(),
                account.getEmailAddress(),
                account.getHomePhone(),
                account.getCellPhone(),
                account.getAccountId());

        return account;
    }
}