package com.rsg.germainsb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsg.germainsb.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

	
}