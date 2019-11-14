package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrderedList1 {
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		System.out.println("Initial List :");
		String line;
		String[] str;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/home/user/Documents/Amit/file.txt"));
			try {
				line = reader.readLine();
				str = line.split(" ");
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
				int[] result = myLinkedList.sorting(array);
				for(int n:result) {
					System.out.print(n+" ");
					myLinkedList.add(n);
				}
				
				System.out.println("\n\nEnter a number :");
				int number = sc.nextInt();
				
				int index = myLinkedList.search(number);
				System.out.println("ndex is :"+index);
				if(index == -1)
					myLinkedList.insertAtPreservedPosition(number);
				else
					myLinkedList.remove(index);
				line = myLinkedList.show();
				System.out.print("Final List :\n"+line);
				
				BufferedWriter writer = new BufferedWriter(new FileWriter("/home/user/Documents/Amit/file.txt"));
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
