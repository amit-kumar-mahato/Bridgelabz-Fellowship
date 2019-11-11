/*
 * Purpose: Perform insertion sort operation
 * @author: Amit
 * @version: 1.0
 * @since: 02-11-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array length :");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		System.out.println("Enter the array element :");
		for(int i=0;i<n;i++) {
			arr[i] = sc.next().toLowerCase();
		}
		
		arr = utility.insertionSort(arr);
		
		System.out.println("After Performed Insertion Sort :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
