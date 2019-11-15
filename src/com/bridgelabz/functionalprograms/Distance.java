/*
 * purpose :A program ​ Distance.java t ​ hat takes two integer command-line arguments x
			and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
			formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function 
 *
 * @author : Amit
 * @version: 1.0
 * @since : 26-10-2019
 * 
 * */
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Utility;

public class Distance {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter value for X and Y :");
		int x = utility.inputInteger();
		int y = utility.inputInteger();
		
		//Calculating distance from the point(x,y) to origin(0,0)
		double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
		System.out.println("Distance From ("+ x + ", "+ y +") to (0, 0) = "+distance);
	}

}
