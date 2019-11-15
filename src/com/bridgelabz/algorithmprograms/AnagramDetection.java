/*
 * Purpose: To check two string are anagram or not
 * @author : Amit
 * @version : 1.0
 * @since : 02-11-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Utility;

public class AnagramDetection {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter string1 :");
		String string1 = utility.inputString().toUpperCase();//user input will convert into UpperCase;	
		System.out.print("Enter string1 :");
		String string2 = utility.inputString().toUpperCase();//user input will convert into UpperCase; //second string
		
		
		if(utility.anagram(string1, string2)) {
			System.out.println("Strings are anagram.");
		}
		else {
			System.out.println("Strings are not anagram.");
		}
	}
}
