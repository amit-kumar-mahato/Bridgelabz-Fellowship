/*
 * Purpose: Prime Number Program and store only the numbers in that range that are Anagrams. 
 * For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
 * @author  Amit
 * @version 1.0
 * @since   12-11-2019
 * 
 * */
package com.bridgelabz.datastructure;

public class PrimeNumberAnagram {
	public static void main(String[] args) {
		int size=1000;
		int primeCount=1;
		int count=0;
		
		while(primeCount<=size)
		{
			if(Utility.checkPrime(primeCount))
			{
				count++;
			}
			primeCount++;
		}
		System.out.println("Anagram Numbers are :");
		
		int prime[] = new int[count];
		primeCount=1;
		int count1=0;
		
		while(primeCount<=size)
		{
			if(Utility.checkPrime(primeCount))
			{
				prime[count1]=primeCount;
				count1++;
			}
			primeCount++;
		}
		Utility.primeAnagram2DArray(prime);
	}
}
