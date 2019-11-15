/*
 * purpose : Given N distinct Coupon Numbers, how many random numbers do you
             need to generate distinct coupon number? This program simulates this random
             process.
 * @author : Amit
 * @version : 1.0
 * @since : 26-10-2019
 * */
package com.bridgelabz.logicalprograms;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class CouponNumbers {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter how many coupon you wants :");
		int n  = utility.inputInteger();
		
		ArrayList<String> coupon = utility.getGeneratedCoupon(n);
		System.out.println(coupon);
	}
}
