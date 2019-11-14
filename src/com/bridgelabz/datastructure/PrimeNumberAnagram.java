/*
 * Purpose: Prime Number Program and store only the numbers in that range that are Anagrams. 
 * For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
 * @author  Amit
 * @version 1.0
 * @since   12-11-2019
 * 
 * */
package com.bridgelabz.datastructure;

import com.bridgelabz.util.Utility;

public class PrimeNumberAnagram {
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		//	prime numbers array between 0 and 1000
		String[] primeNumbers = utility.prime(1000);
		
		System.out.println("Anagram and prime numbers are:");
		//	prints prime numbers that are anagrams
		for(int i = 0; i < primeNumbers.length; i++) {
			for(int j = i + 1; j < primeNumbers.length; j++) {
				if(utility.anagram(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}
	}
}
