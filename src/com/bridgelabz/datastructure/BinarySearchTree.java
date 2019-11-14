/*
 * Purpose : Binary Search Tree
 * 
 * */
package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearchTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("Enter the total number");
		double number=sc.nextDouble();//taking user input
		
		while(number>0)
		{
			double totalNodes=sc.nextDouble();//taking user input
			int totalTree=Utility.numberOfBinarySearchTree(totalNodes);//calling the method
			System.out.println(totalTree);
			number--;
		}
		//System.out.println("Invalied Character");//when condition false
	}
}
