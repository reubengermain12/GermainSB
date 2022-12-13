package com.rsg.germainsb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rsg.germainsb.entities.Customer;

@Service
public class CustomerService {

	// TEMPORARY storage until I implement real database later!
	private List<Customer> customers = new ArrayList<>();


	public List<Customer> readAll() {
		return this.customers;
	}


	public Customer readByID(int id) {
		return this.customers.get(id);
	}


	public Customer create(Customer customer) {
		this.customers.add(customer);

		return this.customers.get(this.customers.size() - 1);
	}


	public Customer update(int id, Customer customer) {
		this.customers.remove(id);
		
		this.customers.add(id, customer);
		
		return this.customers.get(id);
	}
	

	public Customer delete(int id) {
		return this.customers.remove(id);
	}
}