package com.rsg.germainsb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// The purpose of this is to handle incoming HTTP requests and send responses
@RestController
public class CustomerController {

	//GET	-	READ
	@GetMapping("/hello")	//localhost:8080/hello
	public String hello() {
		return "Hello";
	}
	//POST	-	CREATE
	
	//PUT	-	UPDATE
	
	//DELETE	-	DELETE
}