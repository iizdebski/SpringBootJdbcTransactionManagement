package com.izdebski.SpringBootJdbcTransactionManagement;

import com.izdebski.SpringBootJdbcTransactionManagement.dao.exception.InsufficientAccountBalanceException;
import com.izdebski.SpringBootJdbcTransactionManagement.model.Account;
import com.izdebski.SpringBootJdbcTransactionManagement.service.BankService;
import com.izdebski.SpringBootJdbcTransactionManagement.service.impl.BankServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringBootJdbcTransactionManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJdbcTransactionManagementApplication.class, args);
		BankService bankService = ctx.getBean("bankServiceImpl", BankServiceImpl.class);
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(1122330056L);

		Account toAccount = new Account();
		toAccount.setAccountNumber(3355330099L);

		try {
			bankService.transferFund(fromAccount, toAccount, 1000.00);
		} catch (InsufficientAccountBalanceException e) {
			e.printStackTrace();
		}
		System.out.println("All Spring beans loaded by Spring Boot::::::::::::::::::::::::::::::::::::");
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanDefinitionNames);

		for (String beanName : beanDefinitionNames){
			System.out.println(beanName);
		}
		ctx.close();
	}
}