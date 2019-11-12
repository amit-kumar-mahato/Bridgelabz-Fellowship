package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.rmi.CORBA.Util;

public class Hashing {
	static Scanner sc = new Scanner(System.in);
	static Node[] array = new Node[11];
	
	public static void hash(int data) {
		Node node = new Node();
		node.data1 = data;
		node.next = null;
		
		int rem = data%11;
		if(array[rem] == null) {
			array[rem] = node;
		}
		else {
			Node n = array[rem];
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void display() {
		for(int i = 0;i<array.length;i++) {
			Node temp = array[i];
			if (temp != null) {
				System.out.print("Remainder " + i + " : ");
				while (temp != null) {
					System.out.print(temp.data1 + " ");
					temp = temp.next;
				}
			}
			System.err.println();
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
		Utility utility = new Utility();
		hashing.display();
	}
}
