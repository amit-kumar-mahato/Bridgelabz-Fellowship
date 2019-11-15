/*
 * Purpose: Perform bubble sort operation
 * @author: Amit
 * @version: 1.0
 * @since: 02-11-2019
 * 
 * 
 * */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the length of array :");
		int n = utility.inputInteger();
		
		String[] array = new String[n];
		System.out.println("Enter array element :");
		for(int i=0;i<n;i++) {
			array[i] = utility.inputString().toLowerCase();
		}
		array = utility.bubbleSort(array);
		System.out.println("After Performing Bubble Sort :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
