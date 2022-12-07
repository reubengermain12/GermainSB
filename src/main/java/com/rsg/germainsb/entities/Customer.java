package com.rsg.germainsb.entities;

import jakarta.persistence.Entity;

@Entity
public class Customer {

	// Define Table Columns
	private long id;
	private String firstName;
	private String lastName;
	private String email;
}