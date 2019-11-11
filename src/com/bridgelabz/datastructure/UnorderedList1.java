package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedList1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileReader fileReader = new FileReader("E:\\Amit\\test.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			Utility1<String> utility = new Utility1<String>();
			String line= reader.readLine();
			System.out.print("List of Words : \n"+ line);
			
			String[] str = null;
			if(line!=null) {
				str = line.split(" ");
			}
			for(String s: str) {
				utility.add(s);
			}
			
			System.out.println("\n\nEnter a word for search :");
			String word = sc.next();
			
			int index = utility.search(word);
			System.out.println("Index Value is :"+index);
			
			utility.remove(index);
			
			String result = utility.show();
			System.out.print("\n\nResult :\n"+result);
			
			line = utility.show();
			//int size = utility.size(line);
			//System.out.println("After Adding or Removing elements From List, The Size of list is:"+size+"\n");
			System.out.print("\nFinal List are :\n"+line+" ");
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Amit\\test.txt"));
			writer.write(line);
			writer.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
