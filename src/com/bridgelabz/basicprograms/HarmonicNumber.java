/*
 * purpose : Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 * @author : Amit
 * @version : 1.0
 * @since :09-11-2019
 * 
 * */
package com.bridgelabz.basicprograms;

import com.bridgelabz.util.Utility;
class HarmonicNumber{
	public static void main(String[] artgs){
		Utility utility = new Utility();
		System.out.println("Enter the value for n :");
		int n = utility.inputInteger();
		float result = 0f;
		if(n>0){
			
			result = utility.harmonicNumber(n);
			System.out.println("Nth Harmonic value is :"+result);
		}
		else{
			System.out.println("Value of n must be greater than 0 ");
		}
	}
}