/*
 * purpose : Find all the permutation of a string
 * @author: Amit
 * @version : 1.0
 * @since : 02-11-2019
 * */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Utility;

public class StringPermutation {

	
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		System.out.println("Enter the String");
		String str = utility.inputString();
		int length=str.length();
		utility.permutation(str,0,length-1);
		
	}
}
