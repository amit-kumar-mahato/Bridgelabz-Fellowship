/*
 * Purpose: Find Prime Factors of a number
 * @author Amit
 * @version 1.0
 * @since 09-11-2019
 * 
 * */

package com.bridgelabz.basicprograms;

import java.util.*;
class PrimeFactors{
	public static void main(String[] art){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for N :");
		int n = sc.nextInt();
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