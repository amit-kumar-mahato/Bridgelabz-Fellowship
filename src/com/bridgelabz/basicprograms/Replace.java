/*
 * Purpose: Replace username with user input
 * @author Amit
 * @version 1.0
 * @since 09-11-2019
 * 
 * */

package com.bridgelabz.basicprograms;

import com.bridgelabz.util.Utility;	
class Replace {
	static String template = "Hello <<Username>>, How are you";
	public static void main(String[] args){
		Utility utility = new Utility();
		System.out.println("Enter username :");
		String username = utility.inputString();
		if(username.length()<=3){
			System.out.println("Username must be greater than 3 character!");
			System.out.println("Please Enter a valid username :");
			username = utility.inputString();
		}
		
		template = template.replace("Username", username);
		System.out.println(template);
	}
}