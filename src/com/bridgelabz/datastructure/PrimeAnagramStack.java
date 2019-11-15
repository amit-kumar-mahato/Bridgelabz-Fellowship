/*
 * purpose : Find prime number in the range of 0-1000 and push in a stack using linked list
 * @author : Amit
 * @version :1.0
 * @since 14-11-2019
 * */
package com.bridgelabz.datastructure;

import com.bridgelabz.util.Utility;
 
public class PrimeAnagramStack {
	
	 public static void main(String[] args) {
		Utility utility = new Utility();
		MyStack<String> myStack = new MyStack<>();
		String[] primeNumbers = utility.prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				if (utility.anagram(primeNumbers[i], primeNumbers[j])) {
					myStack.push(primeNumbers[i]);
					myStack.push(primeNumbers[j]);
				}
			}
		}
		
		String numbers = myStack.display();
		System.out.println("Anagrams in Reverse Ordeer :");
		for(int i=numbers.length()-1;i>0;i--) {
			System.out.print(numbers.charAt(i));
		}
	}
}
