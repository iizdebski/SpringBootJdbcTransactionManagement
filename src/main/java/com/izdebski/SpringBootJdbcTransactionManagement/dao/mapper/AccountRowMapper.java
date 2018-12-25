package com.izdebski.SpringBootJdbcTransactionManagement.dao.mapper;

import com.izdebski.SpringBootJdbcTransactionManagement.model.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {

    public Account mapRow(ResultSet rs, int rowNum)
            throws SQLException {
        Account account = new Account();
        account.setAccountBalance(rs.getDouble("account_balance"));
        account.setAccountHolderName(rs.getString("account_holder_name"));
        account.setAccountNumber(rs.getLong("account_no"));
        account.setAccountType(rs.getString("account_type"));
        return account;
    }
}