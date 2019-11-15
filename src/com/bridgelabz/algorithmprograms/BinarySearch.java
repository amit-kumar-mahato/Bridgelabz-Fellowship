/*
 * Purpose: Perform Binary search operation
 * @author: Amit
 * @version: 1.0
 * @since: 02-11-2019
 * 
 * */
package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.Utility;

public class BinarySearch {
	
	public static void main(String[] args) {
		Utility utility = new Utility();

		try {
			File file = new File("/home/user/Documents/Amit/file.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);

			String line;
			String[] arr = null;
			System.out.println("Before Sorting :");
			while ((line = br.readLine()) != null) {
				arr = line.split(" ");
				System.out.println(line);
			}

			// For Sorting
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j].compareTo(arr[j + 1]) > 0) {
						String temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			System.out.println("\nAfter Sorting :");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n\nEnter name you want to search :");
			String name = utility.inputStringLine();
			boolean result = Utility.binarySearch(arr, name);
			if (result)
				System.out.println("\n\nName is Found!!!");
			else
				System.out.println("\n\nName is not Found!!!");

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
