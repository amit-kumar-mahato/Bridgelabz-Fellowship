package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileReader fileReader = new FileReader("E:\\Amit\\test.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			Utility utility = new Utility();
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
			 
			utility.search(word);
			
			line = utility.show();
			//System.out.println("After Adding or Removing elements From List, The Size of list is:"+size+"\n");
			System.out.print("Final List are :\n"+line+" ");
			
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
