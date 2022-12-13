package com.rsg.germainsb.controllers;

import java.util.ArrayList;
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

// The purpose of this is to handle incoming HTTP requests and send responses
// Uses JSON data
@RestController
@RequestMapping("/customer") // Adds a prefix to the request URLs
public class CustomerController {


	// GET - READ
	// There are 2 types of reads: Read ALL & Read by ID
	@GetMapping("/readAll")
	public List<Customer> readAll() {
	}

	// @GetMapping("/hello") //localhost:8080/hello
	// public String hello() {
	// return "Hello";
	// }

	// ReadByID
	@GetMapping("/readByID/{id}")
	public Customer readByID(@PathVariable int id) {
	}

	// POST - CREATE
	@PostMapping("/create") // localhost:8080/customer/create
	public Customer create(@RequestBody Customer customer) {
	}

	// PUT - UPDATE
	@PutMapping("/update/{id}")
	public Customer update(@PathVariable int id, @RequestBody Customer customer) {
		
	}
	

	// DELETE - DELETE
	@DeleteMapping("/delete/{id}")
	public Customer delete(@PathVariable int id) {
	}
}