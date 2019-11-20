package coom.blbz.inventorymanagement.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * purpose : This class contains all the methods which are using repeatedly in our project
 * @author : Amit
 * @version : 1.0
 * @since : 19-11-2019
 * 
 * */
public class Utility {
Scanner sc;
	
	public Utility() {
		sc = new Scanner(System.in);
	}
	
	/**
	 * Takes input with the user via Scanner for String
	 * 
	 * @return INPUT STRING
	 */
	public String inputString() {
		try {
			return sc.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for StringLine
	 * 
	 * @return INPUT STRING LINE
	 */
	public String inputStringLine() {
		try {
			sc.nextLine();
			return sc.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	public void inputReset() {
		try {
			 sc.next();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Takes input with the user via Scanner for Integer
	 * 
	 * @return INPUT INTEGER
	 */
	public int inputInteger() {
		try {
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Double
	 * 
	 * @return INPUT DOUBLE
	 */
	public double inputDouble() {
		try {
			sc.nextLine();
			return sc.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	

	/**
	 * Takes input with the user via Scanner for Boolean
	 * 
	 * @return INPUT BOOLEAN
	 */
	public boolean inputBoolean() {
		try {
			return sc.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public boolean validOption(int option) {
		if(option == 1 || option == 2 || option == 3)
			return true;
		return false;
	}

	public static JSONObject readData() {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = new JSONObject();
		
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("inventory.json"));
			
			//System.out.println("Data from utility :"+jsonObject);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
}
