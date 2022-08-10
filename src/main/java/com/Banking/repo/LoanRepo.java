package com.Banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Banking.entity.Loan;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Long>{

}
