package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class MailDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Great Learning. Follow the steps to generate your credentials:");
		System.out.println("Please enter your First Name :");
		String firstname = scanner.nextLine();
		System.out.println("Please enter your Last Name :");
		String lastname = scanner.nextLine();

		Employee employeeObject = new Employee(firstname, lastname);

		System.out.println("Please select your Department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = scanner.nextInt();
		String departmentName = "";

		switch (option) {

		case 1:
			departmentName = "tech";
			break;

		case 2:
			departmentName = "admin";
			break;

		case 3:
			departmentName = "hr";
			break;

		case 4:
			departmentName = "lgl";
			break;

		default:
			System.out.println("Please enter the valid option");
		}

		CredentialService credentialService = new CredentialService();
		String generateEmail = credentialService.generateEmailAddress(firstname.toLowerCase(), lastname.toLowerCase(),
				departmentName);
		String generatedpassword = credentialService.generatePassword();
		credentialService.showCredentials(employeeObject, generateEmail, generatedpassword);
	}
}
