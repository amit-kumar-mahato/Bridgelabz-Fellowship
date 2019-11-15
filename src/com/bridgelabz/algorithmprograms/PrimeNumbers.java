/*
 * purpose : Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 * @author: Amit
 * @version : 1.0
 * @since : 02-11-2019
 * */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Utility;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		for(int i=2;i<=1000;i++) {
			if(utility.checkPrime(i))
				System.out.print(i+" ");
		}
	}
}
