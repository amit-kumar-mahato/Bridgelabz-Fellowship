/*
 * Purpose: Perform merge sort 
 * @author: Amit
 * @version: 1.0
 * @since: 02-11-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Utility;

public class MergeSort {
	
	private static void printArray(int[] array) {
		for(int i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		int[] array = {8,5,23,16,45,38,67,56,91};
		System.out.println("Initial Array :");
		printArray(array);
		
		array = utility.mergeSort(array);
		System.out.println("Sorted Array :");
		printArray(array);
	}
}
