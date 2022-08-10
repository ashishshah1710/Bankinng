package com.Banking.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Banking.controller.dto.BankFormDto;
import com.Banking.entity.Customer;
import com.Banking.entity.Loan;
import com.Banking.repo.CustomerRepo;
import com.Banking.repo.LoanRepo;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
@Transactional
public class BankLoanService {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private LoanRepo loanRepo;
	
	public String takeLoan(BankFormDto bankFormDto) {

		Customer customer = new ObjectMapper().convertValue( bankFormDto, Customer.class);

		Long Account = customerRepo.save(customer).getAccount();

		System.out.println("Customer details saved successfully.");

		Loan loan = new Loan(new Date(System.currentTimeMillis()), 101L, Account);

		Long LoanAccountnum= loanRepo.save(loan).getLoanAccountnum();

		return "Loan Sanction"+LoanAccountnum;
	}
}
