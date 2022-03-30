package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {
	public String generatePassword() {
		// number , capital letter ,small letter , special charactor

		String generatedPassword = "";
		String number = "1234567890";
		String captialletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters = "abcdefghijklmnopqrstuvwxyz";
		String specialchars = "!@#$%^&*()";

		String values = number + captialletters + smallletters + specialchars;
		Random randomize = new Random();
		char[] password = new char[8];
		int lenghthOfValue = values.length();

		for (int i = 0; i < 8; i++) {
			int randomNextInteger = randomize.nextInt(lenghthOfValue);
			password[i] = values.charAt(randomNextInteger);
		}
		generatedPassword = password.toString();
		return generatedPassword;
	}

	public String generateEmailAddress(String firstname, String lastname, String departmentName) {

		// firstnamelastname@department.company.com

		String generatedEmailAddress = firstname + lastname + "@" + departmentName + ".greatlearning.com";
		return generatedEmailAddress;
	}

	public void showCredentials(Employee employeeobject, String email, String generatedPassword) {
		// show all the details with password
		System.out.println("Dear " + employeeobject.getFirstName() + " Your credentials are as below: ");
		System.out.println("Email: " + email);
		System.out.println("Password:  " + generatedPassword);
		System.out.println("Thank you!!!");
	}
}
