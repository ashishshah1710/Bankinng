package com.Banking.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Loan 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long LoanAccountnum;
	private Date date;
	private Long LoanAmount;
	public Long getLoanAccountnum() {
		return LoanAccountnum;
	}
	public void setLoanAccountnum(Long loanAccountnum) {
		LoanAccountnum = loanAccountnum;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		LoanAmount = loanAmount;
	}
	public Long getAccount() {
		return Account;
	}
	public void setAccount(Long account) {
		Account = account;
	}
	public Loan( Date date, Long loanAmount, Long account) {
		super();
		
		this.date = date;
		LoanAmount = loanAmount;
		Account = account;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Long Account;

}
