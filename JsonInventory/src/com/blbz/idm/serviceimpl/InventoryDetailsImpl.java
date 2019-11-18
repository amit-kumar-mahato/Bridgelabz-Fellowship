package com.blbz.idm.serviceimpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.swing.text.html.HTMLEditorKit.Parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.blbz.idm.service.InventoryDetailsI;
import com.blbz.util.Utility;

public class InventoryDetailsImpl implements InventoryDetailsI {
	String path = "/home/user/Documents/Amit/inventory.json";
	Utility utility = new Utility(); 

	@SuppressWarnings("unchecked")
	@Override
	public void defaultInventory() {
		JSONObject finalObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		JSONArray jsonArray1 = new JSONArray();
		JSONArray jsonArray2 = new JSONArray();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Basmati");
		jsonObject.put("Weight", 50.0);
		jsonObject.put("Price", 1000.0);
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("Name", "wheat");
		jsonObject1.put("Weight", 20.0);
		jsonObject1.put("Price", 500.0);
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("Name", "pulse");
		jsonObject2.put("Weight", 10.0);
		jsonObject2.put("Price", 100.0);
		
		jsonArray.add(jsonObject);
		jsonArray1.add(jsonObject1);
		jsonArray2.add(jsonObject2);
		
		finalObject.put("Rice", jsonArray);
		finalObject.put("Wheat", jsonArray1);
		finalObject.put("Pulses", jsonArray2);
		
		//finalObject.put("Rice", value)
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			writer.write(finalObject.toJSONString());
			
			//System.out.println("Successfully Copied JSON Object to File...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void inventoryList(JSONArray jsonArray) {
		
		String array = jsonArray.toString();
		System.out.println(array);

	}

	/**
	 * Takes user input and writes data to json objcet and object to file
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void writeData() {
		//Inventory array
		String[] names = new String[] {"Rice", "Wheat","Pulses"};
		JSONObject finalObject = new JSONObject();	
		for(String name: names) {
			System.out.print("Enter number of types of " + name + " : ");
			int count = utility.inputInteger();	//	types of every inventory
			JSONArray array = new JSONArray();	//	array to store types
			
			for(int i = 0; i < count; i++) {	//	 object for every type
				JSONObject jsonObject  = new JSONObject();
				System.out.print("Enter name, weight and price: ");
				jsonObject.put("name", utility.inputStringLine());
				jsonObject.put("weight", utility.inputDouble());
				jsonObject.put("price", utility.inputDouble());
				array.add(jsonObject);
			}			
			finalObject.put(name , array);
		}
	
		 //	to write data to the file
		try(PrintWriter printWriter = new PrintWriter(path)) {
			printWriter.write(finalObject.toJSONString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * reads data from json file and 
	 * prints inventory value of Rice, Pulses and Wheat
	 */

	@Override
	public void readData() {
		JSONArray array = new JSONArray();	//	array to get json data from file
		JSONParser parser = new JSONParser();	//	parser to parse data from file
		JSONObject object;	// json object to store every type of inventory
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			//object = (JSONObject) parser.parse(new BufferedReader(new FileReader(path)));
			object = (JSONObject) parser.parse(bufferedReader);
			array = (JSONArray) object.get("Rice");
			System.out.println("Rice inventory value: " + getValue(array));
			array = (JSONArray) object.get("Pulses");
			System.out.println("Pulses inventory value: " + getValue(array));
			array = (JSONArray) object.get("Wheat");
			System.out.println("Wheat inventory value: " + getValue(array));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param array - json array
	 * @returns value of given inventory array
	 */
	double getValue(JSONArray array){
		Iterator<?> iterator = array.iterator();	//	iterator to iterate
		double value = 0;	//	inventory value
		while(iterator.hasNext()) {
			JSONObject obj = (JSONObject)iterator.next();
			double weight = (double)obj.get("Weight");
			double price = (double)obj.get("Price");
			value = value + weight * price;	//	adding value
		}
		return value;
	}
}
