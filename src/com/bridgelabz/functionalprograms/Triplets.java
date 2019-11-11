 package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Triplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int count = 0;
		
		//Create an Integer array
		int[] array = new int[n];
		//Initialise array inside for loop by taking value from command line
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		//Logic for finding sum of triplets is zero
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				for(int k=j+1;k<array.length;k++) {
					if(array[i]+array[j]+array[k] == 0) {
						System.out.println("Triplets are :"+array[i]+","+array[j]+","+array[k]);
						count++;
					}
				}
			}
		}
		System.out.println("Number of Distinct Triplets is :"+count);
	}

}
