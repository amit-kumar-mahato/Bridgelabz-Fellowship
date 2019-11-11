package com.bridgelabz.algorithmprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	static String firstName;
	static String fullName;
	static String contactNumber;
	static String date;
	
	static String message = "Hello <<name>>, We have your full name as <<full name>> in our system."
			+ "Your contact number is 91-XXXXXXXXXX. Please, let us know in case of any clarification."
			+ "Thank you BridgeLabz 01/01/2016.";
	/*
	 * function to perform binary search
	 * @param type string
	 * @return boolean
	 * 
	 * */
	public static boolean binarySearch(String[] arr,String name) {
		int max = arr.length-1;
		int low = 0;
		int mid = 0;
		
		while(low<=max) {
			mid = (low+max)/2;
			if(name.equals(arr[mid]))
				return true;
			if(name.compareTo(arr[mid])>0) {
				low = mid+1;
			}
			else
				max = mid-1;
		}
		return false;
	}

	/*
	 * function to perform bubble sort
	 * @param type string array
	 * @return string array
	 * 
	 * */
	public String[] bubbleSort(String[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	/*
	 * function to perform insertion sort
	 * @param type string array
	 * @return string array
	 * 
	 * */
	public String[] insertionSort(String[] arr) {
		String temp;
		int j;
		for(int i = 1;i<arr.length;i++) {
			temp = arr[i];
			j = i;
			
			while(j>0 && arr[j-1].compareTo(temp)>0) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
		return arr;
	}

	/*
	 * function to divide the array
	 * @param type array
	 * @return array
	 * 
	 * */
	public int[] mergeSort(int[] array) {
		if(array.length <=1)
			return array;
		
		int midPoint = array.length/2;
		int[] left = new int[midPoint];
		int[] right;
		
		if(array.length%2 == 0) {
			right = new int[midPoint];
		}
		else
			right = new int[midPoint+1];
		
		for(int i=0;i<midPoint;i++) {
			left[i] = array[i];
		}
		
		for(int i=0;i<right.length;i++) {
			right[i] = array[midPoint+i];
		}
		
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = merge(left,right);
		
		return result;
	}
	
	/*
	 * function to merge two array
	 * @param type array
	 * @return array
	 * 
	 * */
	private int[] merge(int[] left, int[] right) {
		
		int[] result = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length || j < right.length) {
			if (i < left.length && j < right.length) {
				if (left[i] < right[j]) {
					result[k] = left[i];
					k++;
					i++;
				} else {
					result[k] = right[j];
					k++;
					j++;
				}
			} else if (i < left.length) {
				result[k] = left[i];
				k++;
				i++;
			} else if (j < right.length) {
				result[k] = right[j];
				k++;
				j++;
			}
		}
		return result;
	}

	public static String replace(String stringToBeReplaced, String replacement) {
		Pattern pattern = Pattern.compile(stringToBeReplaced);
		Matcher matcher = pattern.matcher(message);
		return message = matcher.replaceAll(replacement);
	}
}
