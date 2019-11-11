/*
 * Purpose: Determines whether year is Leap Year or not
 * @author Amit
 * @version 1.0
 * @since 07-11-2019
 * 
 * */

package com.bridgelabz.basicprograms;

import java.util.Scanner;
class LeapYear{
	public static void main(String[] args){
		
		//Creating Scanner object to read user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year :");
		String year = sc.next();
		
		if(year.length()==4) {
			Utility utility = new Utility();
			int result = utility.checkLeapYear(year);
			if(result%4==0 ||result%400==0 ||result%100==0)
				System.out.println(result +" is a Leap Year");
			else
				System.out.println(result +" is not a Leap Year");		
		}
		else
			System.out.println("Length should be 4");
	}
}