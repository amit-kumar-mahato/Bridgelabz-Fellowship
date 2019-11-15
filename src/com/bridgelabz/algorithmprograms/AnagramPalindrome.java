/*
 * Purpose: To check prime number that are pallindrome
 * @author: Amit
 * @version: 1.0
 * @since: 02-09-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;

import com.bridgelabz.util.Utility;

public class AnagramPalindrome{
	static ArrayList palindromeList = new ArrayList();
	static ArrayList anagramList = new ArrayList();
	static ArrayList primeList = new ArrayList();
	public static void main(String[] args) {
		Utility utility = new Utility();
		
		for(int i=2;i<=1000;i++) {
			if(utility.checkPrime(i)) {
				primeList.add(i);
				palindromeList.add(i);
				anagramList.add(i);
			}
		}
		
		System.out.println("prime Numbers ");
		for(Object i: primeList) {
			System.out.print((int)i+" ");
		}
		System.out.println("\n\nPrime Numbers that are Pallindrome ");
		for(Object i: palindromeList) {
			if(Utility.checkForPalindrome((int) i))
				System.out.print(i+" ");
		}
		
		System.out.println("\n\nPrime Numbers that are Anagram ");
		Object[] array = primeList.toArray();
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(utility.anagram(array[i].toString(), array[j].toString()))
					System.out.print(array[i]+" "+array[j]+" ");
			}
		}
	}
}
