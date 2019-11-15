/*
 * purpose : A program ​ Calendar.java that takes the month and year as command-line
				arguments and prints the Calendar of the month. Store the Calendar in an 2D Array,
				the first dimension the week of the month and the second dimension stores the day
				of the week.
 * @author : Amit
 * @version : 1.0
 * @since : 15-11-2019
 * 
 * */
package com.bridgelabz.datastructure;

import com.bridgelabz.util.Utility;

public class Calender {
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter month and year");
		int month = utility.inputInteger();
		int year = utility.inputInteger();
		utility.calender(month,year);
		
	}
}
