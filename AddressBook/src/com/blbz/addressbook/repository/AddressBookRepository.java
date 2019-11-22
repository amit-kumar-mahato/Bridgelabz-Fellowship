package com.blbz.addressbook.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.blbz.addressbook.controller.AddressBookController;
import com.blbz.addressbook.serviceimpl.AddressBookServiceImpl;

public class AddressBookRepository {
	static JSONParser jsonParser = new JSONParser();
	static JSONObject jsonObject = new JSONObject();
	
	/*
	 * By using this method we write our user input data into the file as a json format
	 * @param-data - JSONObject
	 * @return - null
	 * 
	 * */
	public static void writeData(JSONObject obj) {
		try (FileWriter fileWriter = new FileWriter("addressbook.json")) {
			fileWriter.write(obj.toJSONString());
			System.out.println("Data is added to the file!!!\n\n");
			//AddressBookController.addUser();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Reads data from json file and 
	 * @param-type: No Argument
	 * @return-type: JSONObject 
	 * 
	 */
	public static JSONObject readData() {
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("addressbook.json"));
			
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
