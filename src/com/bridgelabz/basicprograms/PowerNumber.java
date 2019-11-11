package com.bridgelabz.basicprograms;

/*
 * Purpose: Find Power of 2
 * @author Amit
 * @version 1.0
 * @since 07-11-2019
 * 
 * */

import java.util.*;
import java.lang.*;
class PowerNumber{
	public static void main(String[] artgs){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value for n :");
		int n = sc.nextInt();
		
		if(n>=0 && n<=31){
			Utility utility = new Utility();
			int[] array = new int[n+1];
			array = utility.power(n);
			
			//It will show power of 2 upto n 
			for(int i=0;i<array.length;i++){
				System.out.println("2 * "+i+" = "+ array[i]);
			}
		}
		else
			System.out.println(" N value must be greater than 0 and less than 32");
	}
}