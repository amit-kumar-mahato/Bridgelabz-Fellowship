package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for X and Y :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//Calculating distance from the point(x,y) to origin(0,0)
		double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
		System.out.println("Distance From ("+ x + ", "+ y +") to (0, 0) = "+distance);
	}

}
