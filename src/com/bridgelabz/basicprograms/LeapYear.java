/*
 * Purpose: Determines whether year is Leap Year or not
 * @author Amit
 * @version 1.0
 * @since 07-11-2019
 * 
 * */

package com.bridgelabz.basicprograms;

import com.bridgelabz.util.Utility;
class LeapYear{
	public static void main(String[] args){
		Utility utility = new Utility();
		
		System.out.println("Enter a year :");
		String year = utility.inputString();
		
		if(year.length()==4) {
			
			if(utility.leapYear(Integer.parseInt(year)))
				System.out.println(year +" is a Leap Year");
			else
				System.out.println(year +" is not a Leap Year");	
		}
		else
			System.out.println("Length should be 4");
	}
}