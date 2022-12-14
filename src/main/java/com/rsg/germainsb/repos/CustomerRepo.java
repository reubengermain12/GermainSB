package com.rsg.germainsb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsg.germainsb.entities.Customer;

// JpaRepository requires both the entity & the data type for the id column. This must be the Object version.
// So long = Long, int = Integer.
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

	
}
