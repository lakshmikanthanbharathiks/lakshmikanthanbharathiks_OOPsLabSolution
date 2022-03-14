package com.greatlearning.EmailApplication.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;

	public String getDepartment() {
		return department;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

}
