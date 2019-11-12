/*
 * purpose: To check whether the string is pallindrome or not
 * @author: Amit
 * @version: 1.0
 * @since: 11-11-2019
 * 
 * 
 * */
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class PallindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		String temp="";
		
		char[] ch = s.toCharArray();
		
		Utility utility = new Utility();
		for(int i=0;i<s.length();i++) {
			utility.addFront(ch[i]);
		}
		
		for(int i=0;i<s.length();i++) {
			temp += utility.removeRear();
		}
		
		if(s.equals(temp))
			System.out.println("Given String pallindrome!!!");
		else
			System.out.println("Given String is not Pallindrome!!!");
	}
}
