/*
 * Purpose: Customize Message Demonstration using String Function and RegEx
 * @author: Amit
 * @version: 1.0
 * @since: 10-11-2019
 * 
 * 
 * */
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDemonstration {
	
	String firstName;
	String fullName;
	String contactNumber;
	String date;
	
	String message = "Hello <<name>>, We have your full name as <<full name>> in our system."
			+ "Your contact number is 91-XXXXXXXXXX. Please, let us know in case of any clarification."
			+ "Thank you BridgeLabz 01/01/2016.";
	public static void main(String[] args) {
		Utility utility = new Utility();
		
		MessageDemonstration demonstration = new MessageDemonstration();
		demonstration.start(utility);
	}
	private void start(Utility utility) {
		getUserDetails();
		message = utility.replace("<<name>>",firstName);
		message = utility.replace("<<full name>>",fullName);
		message = utility.replace("XXXXXXXXXX",contactNumber);
		message = utility.replace("01/01/2016",date);
		System.out.println(message);
	}
	
	private void getUserDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name :");
		firstName = sc.nextLine();
		
		System.out.println("Enter your Full Name :");
		fullName = sc.nextLine();
		
		System.out.println("Enter contact number :");
		contactNumber = sc.nextLine();
		
		System.out.println("Enter date in dd/mm/yyyy format: ");
		date = sc.nextLine();
	}
}