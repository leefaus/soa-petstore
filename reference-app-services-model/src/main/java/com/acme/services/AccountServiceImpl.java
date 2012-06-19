package com.acme.services;

import com.acme.model.Account;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.acme.services.AccountService",
        name = "AccountService",
        serviceName = "AccountService",
        portName = "AccountPortType",
        targetNamespace = "http://acme.com/services")
//        wsdlLocation = "xml/accountservice.wsdl")
public class AccountServiceImpl implements AccountService {

    @Override
    public Account modifyAccount(Account account) {
                return account;
    }

    @Override
    public String deleteAccount(Account account){

        return "deleted";
    }
}
