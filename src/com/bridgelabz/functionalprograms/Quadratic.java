package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a,b and c :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double x1,x2;
		
		int delta = ((b*b)-(4*a*c));
		
		if(delta > 0) {
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			
			System.out.println("Root 1 of x ="+ x1);
			System.out.println("Root 2 of x ="+ x2);
		}
		else if(delta == 0) {
			x1 = x2 = -b/(2*a);
			System.out.format("Root 1 of x = Root 2 of x = %.2f;", x1);
		}
		else {
            System.out.format("This equation has no real roots");
		}
		
	}
}
