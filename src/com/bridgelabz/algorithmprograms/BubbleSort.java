/*
 * Purpose: Perform bubble sort operation
 * @author: Amit
 * @version: 1.0
 * @since: 02-11-2019
 * 
 * 
 * */
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int n = sc.nextInt();
		
		String[] array = new String[n];
		System.out.println("Enter array element :");
		for(int i=0;i<n;i++) {
			array[i] = sc.next().toLowerCase();
		}
		array = utility.bubbleSort(array);
		System.out.println("After Performing Bubble Sort :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
