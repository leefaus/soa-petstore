package com.acme.services;


import com.acme.model.Account;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public interface AccountService {
    @WebMethod
    @XmlElement(name="account")


    public Account modifyAccount(Account account);
    public String deleteAccount(Account account);

}
