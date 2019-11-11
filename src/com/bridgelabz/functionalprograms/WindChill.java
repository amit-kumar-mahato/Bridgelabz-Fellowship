package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for t and v :");
		int t = sc.nextInt();
		int v = sc.nextInt();
		
		if(t>50 && v>3 && v<120) {
			double w = 35.74+(0.6215*t)+((0.4275*t)-35.75)*Math.pow(v, 0.16);
			
			System.out.println("Temperature : "+w);
		}
		else
			System.out.println("Please enter the value of t and v into the range");
	}

}
