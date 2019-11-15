/*
 * purpose: To check whether the string is pallindrome or not
 * @author: Amit
 * @version: 1.0
 * @since: 11-11-2019
 * 
 * */
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class PallindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		StringBuilder temp=new StringBuilder();
		
		sc.close();
		char[] ch = s.toCharArray();
		
		MyDeque<Character> utility = new MyDeque<>();
		for(int i=0;i<s.length();i++) {
			utility.addFront(ch[i]);
		}
		
		for(int i=0;i<s.length();i++) {
			temp.append(utility.removeFront());
		}
		
		System.out.println("\nReverse :"+temp.toString());
		if(s.equals(temp.toString()))
			System.out.println("Given String is pallindrome!!!");
		else
			System.out.println("Given String is not Pallindrome!!!");
	}
}
