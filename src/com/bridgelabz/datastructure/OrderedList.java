package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrderedList {
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Initial List :");
		String line;
		String[] str;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("E:\\Amit\\test1.txt"));
			try {
				line = reader.readLine();
				str = line.split(",");
				int[] array = new int[str.length];
				int i=0;
				for(String s: str) {
					array[i] = Integer.parseInt(s);
					i++;
				}
				for(int a: array) {
					System.out.print(a+" ");
				}
				System.out.println("\n\nAfter Sorting ");
				int[] result = utility.sorting(array);
				for(int n:result) {
					System.out.print(n+" ");
					utility.insertInt(n);
				}
				
				System.out.println("\n\nEnter a number :");
				int number = sc.nextInt();
				
				utility.searchInt(number);
				//utility.insertAtPreservedPosition(number);
				line = utility.displayInt();
				System.out.print("Final List :\n"+line);
				
				BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Amit\\test1.txt"));
				writer.write(line);
				
				reader.close();
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
