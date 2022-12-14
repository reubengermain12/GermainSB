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

// The purpose of this is to handle incoming HTTP requests and send responses
// Uses JSON data
@RestController
@RequestMapping("/customer") // Adds a prefix to the request URLs
public class CustomerController {


	private CustomerService service;
	
	//Dependency Injection
	public CustomerController(CustomerService service) {
		this.service = service;
	}
	
	// GET - READ
	@GetMapping("/readAll")
	public List<Customer> readAll() {
		return this.service.readAll();
	}

	// ReadByID
	@GetMapping("/readByID/{id}")
	public Customer readByID(@PathVariable long id) {
		return this.service.readByID(id);
	}

	// POST - CREATE
	@PostMapping("/create") // localhost:8080/customer/create
	public Customer create(@RequestBody Customer customer) {
		return this.service.create(customer);
	}

	// PUT - UPDATE
	@PutMapping("/update/{id}")
	public Customer update(@PathVariable long id, @RequestBody Customer customer) {
		return this.service.update(id, customer);
	}
	

	// DELETE - DELETE
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable long id) {
		return this.service.delete(id);
	}
}