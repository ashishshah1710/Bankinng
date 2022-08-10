package com.Banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Banking.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
