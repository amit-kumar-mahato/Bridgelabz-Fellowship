package com.bridgelabz.util;

import java.util.Arrays;

public class Utility  {

	//For Primenumbers in 2D array
	public void prime2DArray() {
		int array[][]=new int[10][100];
		int prime[][]=new int[10][100];
		int temp=1;
		for (int i = 0; i< 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j]=temp;
				temp++;
			}
		}
		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 100; j++) {
				if(checkPrime(array[i][j]))
				{
					prime[i][j]=array[i][j];
				}
				else
				{
					prime[i][j]=-1;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 100; j++) {
				if(prime[i][j]!=-1)
				{
					System.out.print(prime[i][j]+" ");
				}
			}
			System.out.println("\n");
		}
	}
	
	/*
	 * Check prime
	 */
	public static boolean checkPrime(int number)
	{
		int count=0;
		for (int i = 2; i <=number/2; i++) {
			if(number%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void primeAnagram2DArray(int[] prime) {
		for (int i = 0; i < prime.length; i++) {
			System.out.println(i);
		}
	}

	public static int numberOfBinarySearchTree(double totalNodes) {
		double n=factorial(2*totalNodes);
		double d=(factorial(totalNodes+1))*(factorial(totalNodes));
		double differentTree=n/d;
		return (int) differentTree;
	}
	/*
	 * Calculating the factorial of the given number
	 * 
	 * @param i
	 * @return factorial of the given number
	 */
	public static int factorial(double i)
	{
		int fact=1;
		while(i>0)
		{
			fact=(int) (fact*i);
			i--;
		}
		return fact;
	}
	
	/**
	 * @param range- up to which prime numbers are to be found
	 * @returns string array of prime numbers in  a given range
	 */
	public String[] prime(int range) {
		String[] array = new String[1000];
		int position = 0;
		for(int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++) {
				if((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for(int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}
	
	/** Returns true if strings are anagram else returns false **/
	public boolean anagram(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
				
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

}
