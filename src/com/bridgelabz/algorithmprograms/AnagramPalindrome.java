/*
 * Purpose: To check prime number that are pallindrome
 * @author: Amit
 * @version: 1.0
 * @since: 02-09-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;

public class AnagramPalindrome {
	static ArrayList list = new ArrayList();
	public static void main(String[] args) {
		for(int i=2;i<=1000;i++) {
			checkForPrimeNumber(i);
		}
		for(Object i : list) {
			//System.out.println((int)i);
			checkForPalindrome((int) i);
		}
	}
	
	private static void checkForPrimeNumber(int n) {
		boolean result = false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				result = true;
				break;
			}
		}
		if(result == false) {
			//System.out.print(n+" ");
			list.add(n);
		}
			
	}

	private static void checkForPalindrome(int n) {
		//System.out.print(n+" ");
		
		int temp = n;
		int rem = 0;
		int sum =0;
		
		while(n>0) {
			rem = n%10;
			sum = (sum*10)+rem;
			n = n/10;
		}
		if(temp == sum) {
			System.out.print(temp+" ");
		}
	}
}
