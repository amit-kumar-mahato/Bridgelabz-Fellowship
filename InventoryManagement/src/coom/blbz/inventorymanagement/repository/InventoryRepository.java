package coom.blbz.inventorymanagement.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import coom.blbz.inventorymanagement.util.Utility;

/*
 * purpose: This class contains all the methods releated to file operation
 * @author: Amit
 * @since: 20-11-2019
 * */
public class InventoryRepository {
	String path = "/home/user/Documents/Amit/inventoryfile.json";
	static JSONParser jsonParser = new JSONParser();
	static JSONObject jsonObject = new JSONObject();

	/*
	 * By using this method we write our user input data into the file as a json format
	 * @param-data - JSONObject
	 * @return - null
	 * 
	 * */
	public static void writeData(JSONObject jsonFinalObject) {
		File f = new File("inventory.json");
		
		try (FileWriter fileWriter = new FileWriter(f)) {

			fileWriter.write(jsonFinalObject.toJSONString());
			System.out.println("Data is added to the file!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * reads data from json file and 
	 * prints inventory value of Rice, Pulses and Wheat
	 */
	public static JSONObject readData() {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = new JSONObject();
		
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("inventory.json"));
			
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
