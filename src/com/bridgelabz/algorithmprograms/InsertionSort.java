/*
 * Purpose: Perform insertion sort operation
 * @author: Amit
 * @version: 1.0
 * @since: 02-11-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Utility;

public class InsertionSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the array length :");
		int n = utility.inputInteger();
		
		String[] arr = new String[n];
		
		System.out.println("Enter the array element :");
		for(int i=0;i<n;i++) {
			arr[i] = utility.inputString().toLowerCase();
		}
		
		arr = utility.insertionSort(arr);
		
		System.out.println("After Performed Insertion Sort :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
