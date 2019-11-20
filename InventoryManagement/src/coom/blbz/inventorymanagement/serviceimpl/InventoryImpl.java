package coom.blbz.inventorymanagement.serviceimpl;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import coom.blbz.inventorymanagement.model.InventoryDetails;
import coom.blbz.inventorymanagement.repository.InventoryRepository;
import coom.blbz.inventorymanagement.service.InventoryI;
import coom.blbz.inventorymanagement.util.Utility;

/*
 * purpose : This class provide implementation of methods which are present in InventoryI interface
 * @author : Amit
 * @version : 1.0
 * @since : 19-11-2019
 * 
 * */
public class InventoryImpl implements InventoryI {
	Utility utility = new Utility();
	JSONObject jsonFinalObject = new JSONObject();
	JSONArray jsonArray = new JSONArray();
	int count = 0;
	InventoryDetails inv = new InventoryDetails();


	/**
	 * @param array - json array
	 * @returns value of given inventory array
	 */
	double getValue(JSONArray array) {
		Iterator<?> iterator = array.iterator(); // iterator to iterate
		double value = 0; // inventory value
		while (iterator.hasNext()) {
			JSONObject obj = (JSONObject) iterator.next();
			double weight = (double) obj.get("weight");
			double price = (double) obj.get("price");
			value = value + weight * price; // adding value
		}
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void writeData(int selectedOption) {
		JSONObject json = InventoryRepository.readData();
		json = (JSONObject) json.get("Inventory");
		switch (selectedOption) {
		case 1:

			System.out.println("Enter how many types of Rice you want to add");
			count = utility.inputInteger();

			jsonArray = (JSONArray) json.get("Rice");
			while (count > 0) {
				jsonArray.add(userinput());
				count--;
			}
			break;
		case 2:
			System.out.println("Enter how many types of Wheat you want to add");
			count = utility.inputInteger();
			jsonArray = (JSONArray) json.get("Wheat");
			while (count > 0) {
				jsonArray.add(userinput());
				count--;
			}
			break;
		case 3:
			System.out.println("Enter how many types of Pulses you want to add");
			count = utility.inputInteger();
			jsonArray = (JSONArray) json.get("Pulses");
			while (count > 0) {
				jsonArray.add(userinput());
				count--;
			}
			break;
		default:
			System.out.println("Invlaid Option");
			break;
		}
		jsonFinalObject.put("Inventory", json);

		InventoryRepository.writeData(jsonFinalObject);
	}

	@SuppressWarnings("unchecked")
	private JSONObject userinput() {
		JSONObject jsonObject = new JSONObject();
		System.out.println("Enter name, weight and priceperkg");

		inv.setName(utility.inputString());
		inv.setWeight(utility.inputDouble());
		inv.setPrice(utility.inputDouble());

		jsonObject.put("name", inv.getName());
		jsonObject.put("weight", inv.getWeight());
		jsonObject.put("price", inv.getPrice());

		return jsonObject;
	}

	@Override
	public void inventryList() {
		jsonFinalObject = InventoryRepository.readData();
		System.out.println(jsonFinalObject);
	}

	@Override
	public void calculation(int selected) {
		jsonFinalObject = InventoryRepository.readData();
		JSONObject jsonObject = (JSONObject) jsonFinalObject.get("Inventory");
		double totalInventory = 0;

		switch (selected) {

		case 1:
			jsonArray = (JSONArray) jsonObject.get("Rice");
			System.out.println("Rice inventory value: " + getValue(jsonArray));
			break;
		case 2:
			jsonArray = (JSONArray) jsonObject.get("Wheat");
			System.out.println("Wheat inventory value: " + getValue(jsonArray));
			break;
		case 3:
			jsonArray = (JSONArray) jsonObject.get("Pulses");
			System.out.println("Pulses inventory value: " + getValue(jsonArray));
			break;
		case 4:
			jsonArray = (JSONArray) jsonObject.get("Rice");
			totalInventory = totalInventory + getValue(jsonArray);
			jsonArray = (JSONArray) jsonObject.get("Wheat");
			totalInventory = totalInventory + getValue(jsonArray);
			jsonArray = (JSONArray) jsonObject.get("Pulses");
			totalInventory = totalInventory + getValue(jsonArray);
			System.out.println("Total Inventory :" + totalInventory);
			break;
		default:
			System.out.println("Invalid Option!!!");
			break;
		}
	}
}
