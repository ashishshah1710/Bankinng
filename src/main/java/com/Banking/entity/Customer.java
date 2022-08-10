package com.Banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Account;
	private String Name;
	private String Gender;
	private String Mobile;
	private int Age;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long account, String name, String gender, String mobile, int age) {
		super();
		Account = account;
		Name = name;
		Gender = gender;
		Mobile = mobile;
		Age = age;
	}
	public Long getAccount() {
		return Account;
	}
	public void setAccount(Long account) {
		Account = account;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

}
