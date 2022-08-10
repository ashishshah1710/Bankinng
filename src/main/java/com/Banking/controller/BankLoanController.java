package com.Banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Banking.controller.dto.BankFormDto;
import com.Banking.service.BankLoanService;


@RestController
public class BankLoanController {
	
	@Autowired
	private BankLoanService bankLoanService;
	@PostMapping("/loan")
	public String takeLoan(@RequestBody BankFormDto bankFormDto) {
		return bankLoanService.takeLoan(bankFormDto);
		
	}

}
