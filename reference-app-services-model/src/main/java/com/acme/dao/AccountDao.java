package com.acme.dao;

import com.acme.model.Account;

/**
 * Created with IntelliJ IDEA.
 * User: jbedenbaugh
 * Date: 6/20/12
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AccountDao {

    public Account createAccount(Account account);

    public String deleteAccount(Account account);

    public Account modifyAccount(Account account);


}
