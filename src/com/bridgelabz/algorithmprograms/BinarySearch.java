package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.rmi.CORBA.Util;

public class BinarySearch {
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element you want to search :");
		int n = sc.nextInt();
		
		int [] arr = {2,5,8,12,16,23,38,56,72,91};
		
		boolean result = binarySearch(arr, n);
		if(result)
			System.out.println("Element is found!!!");
		else
			System.out.println("Element Not Found!!!");
	}

	private static boolean binarySearch(int[] arr, int n) {
		int max = arr.length-1;
		int low=0;
		int mid = 0;
		
		if(n<0)
			return false;
		while(low<=max) {
			mid = (low+max)/2;
			//System.out.println("\nMin :"+low+" Max "+max);
			//System.out.print("Mid :"+mid+" ");
			if(n == arr[mid])
				return true;
			if(n > arr[mid])
				low = mid+1;
			else
			{
				max = mid-1;
				//System.out.println("else block :"+low +" "+max);
			}
			
		}
		return false;
	}
*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility utility = new Utility();
		
		/*String[] arr = {"Riyaz","Girish","Anand","Amit","Sudeep","Tushar"};
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));*/
		try {
			File file = new File("E:\\Amit\\test.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);

			String line;
			String[] arr=null;
			System.out.println("Before Sorting :");
			while((line = br.readLine()) != null){
				arr = line.split(" ");
			     System.out.println(line);
			}
			
			//For Sorting
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-1;j++) {
					if(arr[j].compareTo(arr[j+1])>0) {
						String temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			System.out.println("\nAfter Sorting :");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print("\n\nEnter name you want to search :");
			String name = sc.nextLine();
			
			boolean result = utility.binarySearch(arr,name);
			if(result)
				System.out.println("\n\nName is Found!!!");
			else
				System.out.println("\n\nName is not Found!!!");
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
