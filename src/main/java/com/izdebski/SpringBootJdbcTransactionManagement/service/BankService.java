package com.izdebski.SpringBootJdbcTransactionManagement.service;

import com.izdebski.SpringBootJdbcTransactionManagement.dao.exception.InsufficientAccountBalanceException;
import com.izdebski.SpringBootJdbcTransactionManagement.model.Account;

public interface BankService {
    public abstract void transferFund(Account fromAccount, Account toAccount, Double amount)throws InsufficientAccountBalanceException;
}