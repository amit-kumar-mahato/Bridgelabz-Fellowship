/*
 * purpose : To find the roots of the equation a*x*x + b*x + c.
				Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
				can be found using a formula (Note: Take a, b and c as input values)
				delta = b*b - 4*a*c
				Root 1 of x = (-b + sqrt(delta))/(2*a)
				Root 2 of x = (-b - sqrt(delta))/(2*a)
 * @author : Amit
 * @version : 1.0
 * @since : 26-10-2019
 * */
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Utility;

public class Quadratic {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter value for a,b and c :");
		int a = utility.inputInteger();
		int b = utility.inputInteger();
		int c = utility.inputInteger();
		
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
