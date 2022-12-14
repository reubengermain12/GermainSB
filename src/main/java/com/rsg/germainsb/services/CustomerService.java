package com.rsg.germainsb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rsg.germainsb.entities.Customer;
import com.rsg.germainsb.repos.CustomerRepo;

@Service
public class CustomerService {

	private CustomerRepo repo;
	
	public CustomerService(CustomerRepo repo) {
		this.repo = repo;
	}


	public List<Customer> readAll() {
		return this.repo.findAll();
	}


	public Customer readByID(long id) {
		return this.repo.findById(id).get();
	}


	public Customer create(Customer customer) {
		return this.repo.saveAndFlush(customer);
	}


	public Customer update(long id, Customer customer) {
		// 1) Get the existing entry.
		Customer existing = this.repo.findById(id).get();
		// 2 Change the existing entry, using our new customer object above.
		existing.setFirstName(customer.getFirstName());
		existing.setLastName(customer.getLastName());
		existing.setEmail(customer.getEmail());
		// 3) Save the entry back into the Database.
		return this.repo.saveAndFlush(existing);
	}
	

	public boolean delete(long id) {
		this.repo.deleteById(id);
		
		return !this.repo.existsById(id); // This should be false. If it's true, then the delete failed somehow.
	}
}