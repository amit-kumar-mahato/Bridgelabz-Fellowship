/*
 * purpose : Create a Slot of 10 to store Chain of Numbers that belong to each Slot to
				efficiently
 * @author : Amit
 * @version : 1.0
 * @since : 11-11-2019
 * */
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Hashing {
	static Scanner sc = new Scanner(System.in);
	static Node1[] array = new Node1[11];
	
	public static void hash(int data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = null;
		
		int rem = data%11;
		if(array[rem] == null) {
			array[rem] = node;
		}
		else {
			Node1 n = array[rem];
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void display() {
		for(int i = 0;i<array.length;i++) {
			Node1 temp = array[i];
			if (temp != null) {
				System.out.println("index " + i + " : ");
				while (temp != null) {
					System.out.println(temp.data + " ");
					temp = temp.next;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("/home/user/Documents/Amit/file.txt"))){
			String line = reader.readLine();
			String[] temp = line.split(" ");
			int[] array = new int[temp.length];
			for(int i=0;i<temp.length;i++) {
				array[i] = Integer.parseInt(temp[i]);
			}
			for(int i=0;i<array.length;i++) {
				Hashing.hash(array[i]);
			}
		} 
		Hashing hashing = new Hashing();
		hashing.display();
	}
}
