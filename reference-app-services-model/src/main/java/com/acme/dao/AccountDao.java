package com.acme.dao;

import com.acme.model.Account;

public interface AccountDao {

    public Account createAccount(Account account);

    public String deleteAccount(Account account);

    public Account modifyAccount(Account account);


}
