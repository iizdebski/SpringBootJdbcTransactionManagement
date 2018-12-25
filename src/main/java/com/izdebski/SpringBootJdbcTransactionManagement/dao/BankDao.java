package com.izdebski.SpringBootJdbcTransactionManagement.dao;

import com.izdebski.SpringBootJdbcTransactionManagement.dao.exception.InsufficientAccountBalanceException;
import com.izdebski.SpringBootJdbcTransactionManagement.model.Account;

public interface BankDao {
    public abstract void deposit(Account fromAccount, Account toAccount, Double amount);
    public abstract void withdraw(Account fromAccount,Account toAccount,Double amount) throws InsufficientAccountBalanceException;
}