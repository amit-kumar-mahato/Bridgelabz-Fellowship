/*
 * Purpose: Perform merge sort 
 * @author: Amit
 * @version: 1.0
 * @since: 02-11-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

public class MergeSort {
	
	private static void printArray(int[] array) {
		for(int i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Utility utility =new Utility();
		int[] array = {8,5,23,16,45,38,67,56,91};
		System.out.println("Initial Array :");
		printArray(array);
		
		array = utility.mergeSort(array);
		System.out.println("Sorted Array :");
		printArray(array);
	}

	/*int[] array;
	int[] tempArray;
	int length;
	
	public static void main(String[] args) {
		int[] arrayToSort = {8,5,23,16,45,38,67,56,91};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arrayToSort);
		for(int i: arrayToSort) {
			System.out.print(i+" ");
		}
	}
	public void sort(int[] arrayToSort) {
		this.array = arrayToSort;
		this.tempArray = new int[arrayToSort.length];
		this.length = arrayToSort.length;
		divideArray(0, length-1);
	}
	public void divideArray(int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			
			divideArray(low, mid);
			divideArray(mid+1, high);
			
			mergeArray(low,mid,high);
		}
	}
	public void mergeArray(int low, int mid, int high) {
		for(int i=low;i<=high;i++) {
			tempArray[i] = array[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i<=mid && j<=high) {
			if(tempArray[i] < tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			}
			else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while (i<=mid) {
			array[k] = tempArray[i];
		}
	}*/
}
