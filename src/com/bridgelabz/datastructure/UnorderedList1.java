package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.customexception.NoDataPresentException;

public class UnorderedList1 {
	public static void main(String[] args) throws NoDataPresentException {
		Scanner sc = new Scanner(System.in);
		try {
			FileReader fileReader = new FileReader("/home/user/Documents/Amit/file.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			MyLinkedList<String> muLinkedList = new MyLinkedList<>();
			String line= reader.readLine();
			System.out.print("List of Words : \n"+ line);
			
			String[] str = null;
			if(line!=null) {
				str = line.split(" ");
			}
			for(String s: str) {
				muLinkedList.add(s);
			}
			
			System.out.println("\n\nEnter a word for search :");
			String word = sc.next();
			
			int index = muLinkedList.search(word);
			if(index == -1)
				muLinkedList.add(word);
			else
				muLinkedList.remove(index);
			
			String result = muLinkedList.show();
			System.out.println("After Adding and deleting the final list are :\n"+result);
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/user/Documents/Amit/file.txt"));
			bufferedWriter.write(result);
			bufferedWriter.close();
			
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
