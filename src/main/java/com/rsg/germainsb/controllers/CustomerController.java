package com.rsg.germainsb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.germainsb.entities.Customer;

// The purpose of this is to handle incoming HTTP requests and send responses
@RestController
@RequestMapping("/customer") // Adds a prefix to the request URLs
public class CustomerController {

	// TEMPORARY storage until I implement real database later!
	private List<Customer> customers = new ArrayList<>();
	
	//GET	-	READ
//	@GetMapping("/hello")	//localhost:8080/hello
//	public String hello() {
//		return "Hello";
//	}
	//POST	-	CREATE
	
	//PUT	-	UPDATE
	
	//DELETE	-	DELETE
}