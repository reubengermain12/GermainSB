package com.rsg.germainsb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.germainsb.entities.Customer;

// The purpose of this is to handle incoming HTTP requests and send responses
// Uses JSON data
@RestController
@RequestMapping("/customer") // Adds a prefix to the request URLs
public class CustomerController {

	// TEMPORARY storage until I implement real database later!
	private List<Customer> customers = new ArrayList<>();

	// GET - READ
	// There are 2 types of reads: Read ALL & Read by ID
	@GetMapping("/readAll")
	public List<Customer> readAll() {
		return this.customers;
	}

	// @GetMapping("/hello") //localhost:8080/hello
	// public String hello() {
	// return "Hello";
	// }
	// POST - CREATE
	@PostMapping("/create") // localhost:8080/customer/create
	public Customer create(@RequestBody Customer customer) {
		this.customers.add(customer);

		// Returns the latest entry added to the list
		return this.customers.get(this.customers.size() - 1);
	}

	// PUT - UPDATE

	// DELETE - DELETE
}