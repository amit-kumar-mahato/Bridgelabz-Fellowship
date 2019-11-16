package com.bridgelabz.datastructure;

import com.bridgelabz.util.Utility;

public class PrimeAnagramQueue {
	public static void main(String[] args) {
		Utility utility = new Utility();
		MyQueue<String> myQueue = new MyQueue<>();
		String[] primeNumbers = utility.prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				if (utility.anagram(primeNumbers[i], primeNumbers[j])) {
					myQueue.enqueue(primeNumbers[i]);
					myQueue.enqueue(primeNumbers[j]);
				}
			}
		}
		System.out.print(myQueue.display());
	}
}
