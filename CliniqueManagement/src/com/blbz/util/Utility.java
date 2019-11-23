package com.blbz.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

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
	public static boolean stringChecker(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		Predicate<Character> p = s -> s >= 97 && s <= 122 || s >= 65 && s <= 90 || s >= 48 && s <= 57;
		for (char i : ch) {
			if (p.test(i)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Integer check
	 */
	public static boolean checkInteger(String number) {
		char ch[] = number.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				return true;
			}
		}
		return false;
	}

	/*
	 * @param-type: integer
	 * 
	 * @return-type: boolean
	 * 
	 */
	public boolean validOption(int option) {
		if (option == 1 || option == 2 || option == 3)
			return true;
		return false;
	}

	public static String doctorId() {
	    String output = "";
	    String doctorId = "DOC";
	    for (int i = 0 ; i < 3 ; i++){
	        output+=random.nextInt(10);
	    }
	    int outputInt = Integer.parseInt(output);
	    return doctorId+=outputInt;
		
	}
	
	public static String patientId() {
	    String output = "";
	    String doctorId = "PAT";
	    for (int i = 0 ; i < 3 ; i++){
	        output+=random.nextInt(10);
	    }
	    int outputInt = Integer.parseInt(output);
	    return doctorId+=outputInt;
		
	}
	
	public static boolean mobileNumberValidator(String number) {
		if(number.matches("^[789]\\d{9}$")) {
			return true;
		}
		return false;
	}
	
	/** Generates a random ID for patient **/
	public static String getRandomId() {
		Random random = new Random();
		return String.valueOf(random.nextInt(1000)+ 1);
	}
}
