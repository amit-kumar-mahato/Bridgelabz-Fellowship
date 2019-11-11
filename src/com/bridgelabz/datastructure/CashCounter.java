package com.bridgelabz.datastructure;

import java.util.Scanner;

public class CashCounter {

	static double totalAmount = 5000000;
	static final String message = "Welcome To Cash Counter!!!";
	static Scanner sc = new Scanner(System.in);
	static int remainingPerson;
	static int option;
	public static void main(String[] args) {
		Queue queue = new Queue();
		/*queue.enqueue(10);
		queue.enqueue(20);
		
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.dequeue().data);*/
		
		//queue.display();
		System.out.println(message);
		
		option = selectedOption();
		callSwitchCase(queue);
		
	}
	private static void callSwitchCase(Queue queue) {
		switch (option) {
		case 1:
			System.out.println("Enter how many person you want add in Queue :");
			int person = sc.nextInt();
			
			for(int i=1;i<=person;i++) {
				queue.enqueue(i);
			}
			option = selectedOption();
			callSwitchCase(queue);
			break;
			
		case 2:
			System.out.println("Enter Amount to Deposit :");
			double deposit = sc.nextDouble();
			totalAmount = totalAmount+deposit;
			queue.dequeue();
			remainingPerson = queue.size();
			System.out.print("Total Amount :"+totalAmount+"\n\n"+remainingPerson+" Person are in Queue");
			System.out.println("\n\nThanks Visit Again!!!");
			option = selectedOption();
			callSwitchCase(queue);
			break;
			
		case 3:
			System.out.println("Enter Amount to Withdraw :");
			double withdraw = sc.nextDouble();
			totalAmount = totalAmount-withdraw;
			queue.dequeue();
			remainingPerson = queue.size();
			System.out.print("Total Amount :"+totalAmount+"\n\n"+remainingPerson+" Person are in Queue");
			System.out.println("\n\nThanks Visit Again!!!");
			option = selectedOption();
			callSwitchCase(queue);
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
