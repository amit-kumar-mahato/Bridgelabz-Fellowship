/*
 * Purpose: Find Prime Factors of a number
 * @author Amit
 * @version 1.0
 * @since 09-11-2019
 * 
 * */

package com.bridgelabz.basicprograms;

import com.bridgelabz.util.Utility;
class PrimeFactors{
	public static void main(String[] art){
		Utility utility = new Utility();
		System.out.print("Enter a value for N :");
		int n = utility.inputInteger();
		System.out.print("Prime Factors of "+n+ "are :");
		
		//Logic for finding prime factors of a number
		for(int i=2;Math.sqrt(i)<=n;i++){
			while(n%i == 0){
				System.out.print(i+" ");
				n = n/i;
			}
		}
	}
}