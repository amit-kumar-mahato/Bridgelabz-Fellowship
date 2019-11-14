/*
 * purpose : Program which creates Banking Cash Counter where people
			come in to deposit Cash and withdraw Cash.
 * @author : Amit
 * @version : 1.0
 * @since : 11-11-2019
 * */
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class CashCounter {

	static double totalAmount = 5000000;
	static final String message = "Welcome To Cash Counter!!!";
	static Scanner sc = new Scanner(System.in);
	static int remainingPerson;
	static int option;
	public static void main(String[] args) {
		MyQueue<Integer> utility = new MyQueue<>();
		
		System.out.println(message);
		
		option = selectedOption();
		callSwitchCase(utility);
		
	}
	private static void callSwitchCase(MyQueue<Integer> utility) {
		switch (option) {
		case 1:
			System.out.println("Enter how many person you want add in Queue :");
			int person = sc.nextInt();
			
			for(int i=1;i<=person;i++) {
				utility.enqueue(i);
			}
			option = selectedOption();
			callSwitchCase(utility);
			break;
			
		case 2:
			System.out.println("Enter Amount to Deposit :");
			double deposit = sc.nextDouble();
			totalAmount = totalAmount+deposit;
			utility.dequeue();
			remainingPerson = utility.size();
			System.out.print("Total Amount :"+totalAmount+"\n\n"+remainingPerson+" Person are in Queue");
			System.out.println("\n\n-------------------------Thanks Visit Again!!!--------------------------");
			option = selectedOption();
			callSwitchCase(utility);
			break;
			
		case 3:
			System.out.println("Enter Amount to Withdraw :");
			double withdraw = sc.nextDouble();
			totalAmount = totalAmount-withdraw;
			utility.dequeue();
			remainingPerson = utility.size();
			System.out.print("Total Amount :"+totalAmount+"\n\n"+remainingPerson+" Person are in Queue");
			System.out.println("\n\n-------------------------Thanks Visit Again!!!--------------------------");
			option = selectedOption();
			callSwitchCase(utility);
			break;
			
		default:
			System.out.println("Please select a valid option");
			break;
		}
	}
	public static int selectedOption() {
		System.out.println("\nPlease choose following Option :");
		System.out.println("\nEnter 1 to add person :");
		System.out.println("\nEnter 2 to Deposit Amount :");
		System.out.println("\nEnter 3 to withdraw Amount :");
		option = sc.nextInt();
		return option;
	}
}
