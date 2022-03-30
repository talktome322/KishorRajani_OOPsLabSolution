package com.greatlearning.model;

public class Employee {
	private String firstname;
	private String lastname;

	// Default constructor

	public Employee() {

	}
	// Parmatized constructor

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;

	}
	// get & set methode

	// set method

	public void setFirstName(String firstname) {
		this.firstname = firstname;

	}

	public void setLastName(String lastname) {
		this.lastname = lastname;

	}

	// get method
	public String getFirstName() {
		return this.firstname;

	}

	public String getLastName() {
		return this.lastname;

	}

}
