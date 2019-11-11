package com.bridgelabz.logicalprograms;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coupon Number :");
		int n  = sc.nextInt();
		
		ArrayList<String> coupon = getGeneratedCoupon(n);
		System.out.println(coupon);
	}

	private static ArrayList<String> getGeneratedCoupon(int n) {
		int count = 0;
		String temp="";
		ArrayList<String> as = new ArrayList<>();
		while(count<n) {
			String alphaNumericCoupon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			StringBuilder sb = new StringBuilder();
			//String sb = "";
			Random random = new Random();
			
			for(int i=0;i<n;i++) {
				sb.append(alphaNumericCoupon.charAt(random.nextInt(alphaNumericCoupon.length())));
				//sb+= alphaNumericCoupon.charAt(random.nextInt(alphaNumericCoupon.length()));
			}
			count++;
			//System.out.println(sb);
			temp = sb.toString();
			as.add(temp);
		}
		
		return as;
	}
	
	/*public static void main(String[] args) {
		int count = 0;
		while(count<5) {
			String alphaNumericCoupon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			StringBuilder builder = new StringBuilder();
			Random random = new Random();
			
			for(int i=0;i<5;i++) {
				builder.append(alphaNumericCoupon.charAt(random.nextInt(alphaNumericCoupon.length())));
			}
			String s = builder.toString();
			System.out.println(s);
			count++;
		}
		
	}*/
	
	/*public static void main(String[] args) {
		int count = 0;
		while(count<5) {
			char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
			int max=100000000;
			int random=(int) (Math.random()*max);	
			StringBuffer sb=new StringBuffer();
			
			while (random>0)
			{
				sb.append(chars[random % chars.length]);
				random /= chars.length;
			}

			String couponCode=sb.toString();
			System.out.println("Coupon Code: "+couponCode);	
			count++;
		}
	}*/
	
}
