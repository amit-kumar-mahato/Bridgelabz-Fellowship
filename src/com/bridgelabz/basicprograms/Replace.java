/*
 * Purpose: Replace username with user input
 * @author Amit
 * @version 1.0
 * @since 09-11-2019
 * 
 * */

package com.bridgelabz.basicprograms;

import java.util.*;	
class Replace {
	public static void main(String[] args){
		String template = "Hello <<Username>>, How are you";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username :");
		String username = sc.next();
		if(username.length()<=3){
			System.out.println("Username must be greater than 3 character!");
			System.out.println("Please Enter a valid username :");
			username = sc.next();
		}
		
		template = template.replace("Username", username);
		System.out.println(template);
	}
}