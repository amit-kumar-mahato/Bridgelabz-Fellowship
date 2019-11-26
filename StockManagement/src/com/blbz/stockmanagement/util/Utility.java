package com.blbz.stockmanagement.util;

import java.util.Random;
import java.util.Scanner;

/*
 * Purpose: This class contains only methods which we are using in our project
 * @author: Amit
 * @since: 24-11-2019
 * 
 * */
public class Utility {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	
	// Function to check String for only Alphabets 
    public static boolean isStringOnlyAlphabet(String str) 
    { 
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 
    } 
    
    public static int inputinteger() {
		try {
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public static String inputString() {
		try {
			sc.nextLine();
			return sc.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	
	public static long inputLong() {
		try {
			return sc.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public static void scannerClose() {
		try {
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
