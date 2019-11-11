/*
 * Purpose: To check two string are anagram or not
 * @author : Amit
 * @version : 1.0
 * @since : 02-11-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String :");
		String firstString = sc.nextLine().toUpperCase();//user input will convert into UpperCase
		
		System.out.println("Enter Second String :");
		String secondString = sc.nextLine().toUpperCase();//user input will convert into UpperCase
		
		//First check the length of both string if it equal then only perform next condition otherwise execute else part 
		if(firstString.length()==secondString.length()) {
			System.out.println("Coming inside if condition");
			
			//Convert both string in char array
			char[] first = firstString.toCharArray();
			char[] second = secondString.toCharArray();
			
			//Sorting first array
			for(int i=0;i<first.length;i++) {
				for(int j=0;j<first.length-1;j++) {
					if(first[j]>first[j+1]) {
						char temp = first[j];
						first[j] = first[j+1];
						first[j+1] = temp;
					}
				}
			}
			
			//Sorting second array
			for(int i=0;i<second.length;i++) {
				for(int j=0;j<second.length-1;j++) {
					if(second[j]>second[j+1]) {
						char temp = second[j];
						second[j] = second[j+1];
						second[j+1] = temp;
					}
				}
			}
			/*for(int i=0;i<first.length;i++) {
				System.out.print(first[i]);
			}
			for(int i=0;i<second.length;i++) {
				System.out.print(second[i]);
			}*/
			
			//Compairing both array
			if(Arrays.equals(first, second))
				System.out.println("String are Anagram!!!");
			else
				System.out.println("String are Not Anagram!!!");
		}
		else
			System.out.println("Given Strings are not Anagram!!!");
	}
}
