package com.rsg.germainsb.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.germainsb.entities.Customer;
import com.rsg.germainsb.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {


	private CustomerService service;
	
	
	public CustomerController(CustomerService service) {
		this.service = service;
	}
	
	@GetMapping("/readAll")
	public List<Customer> readAll() {
		return this.service.readAll();
	}

	@GetMapping("/readByID/{id}")
	public Customer readByID(@PathVariable long id) {
		return this.service.readByID(id);
	}

	@PostMapping("/create")
	public Customer create(@RequestBody Customer customer) {
		return this.service.create(customer);
	}

	@PutMapping("/update/{id}")
	public Customer update(@PathVariable long id, @RequestBody Customer customer) {
		return this.service.update(id, customer);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable long id) {
		return this.service.delete(id);
	}
}