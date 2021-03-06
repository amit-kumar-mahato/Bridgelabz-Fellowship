/*
 * purpose : 2D arrays of integers, doubles, or booleans from
				standard input and printing them out to standard output.
 * @author : Amit
 * @version : 1.0
 * @since : 26-10-2019
 * */
package com.bridgelabz.functionalprograms;

import java.io.*;
import java.util.*;

import com.bridgelabz.util.Utility;
class DemoArray{
	public static void main(String[] agf){
		Utility utility = new Utility();
		System.out.println("Enter Column Size :");
		int column = utility.inputInteger();
		System.out.println("Enter Row Size :");
		int row = utility.inputInteger();
		
		//Create array for integers element
		int[][] array1 = new int[column][row];
		System.out.println("Enter Integers elements :");
		for(int i=0;i<column; i++){
			for(int j=0;j<row;j++){
				//Inserting elements into array1
				array1[i][j] = utility.inputInteger();
			}
		}
		
		//Create array for doubles element
		double[][] array2 = new double[column][row];
		System.out.println("Enter Doubles elements :");
		for(int i=0;i<column;i++){
			for(int j=0;j<row;j++){
				//Inserting elements into array2
				array2[i][j] = utility.inputDouble();
			}
		}
		
		//Create array for boolean 
		boolean booleanArray[][] = new boolean[column][row];
		System.out.println("Enter Boolean value :");
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				//Inserting boolean value 
				booleanArray[i][j] = utility.inputBoolean();
			}
		}
		display(array1,array2,booleanArray);
	}
	
	public static void display(int[][] array1, double[][] array2, boolean[][] booleanArray){
		PrintWriter pw = new PrintWriter(System.out,true);
		
		//Display Integers
		System.out.println();
		pw.println("2D Array of Integers");
		
		for(int i=0; i<array1.length; i++){
			for(int j=0; j<array1[i].length; j++){
				pw.print(array1[i][j]+" ");
			}
			pw.println("\t");
		}
		
		//Display Doubles
		System.out.println();
		pw.println("\n2D Array of Doubles");
		
		for(int i=0; i<array2.length; i++){
			for(int j=0; j<array2[i].length; j++){
				pw.print(array2[i][j]+" ");
			}
			pw.println("\t");
		}
		
		//Display Boolean 
		System.out.println();
		pw.println("\n2D Array of Boolean ");
		for(int i=0;i<booleanArray.length;i++) {
			for(int j=0;j<booleanArray[i].length;j++) {
				pw.print(booleanArray[i][j]+" ");
			}
			pw.println("\t");
		}
	} 
}