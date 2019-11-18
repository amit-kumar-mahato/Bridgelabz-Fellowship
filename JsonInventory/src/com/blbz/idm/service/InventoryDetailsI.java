package com.blbz.idm.service;

import org.json.simple.JSONArray;

public interface InventoryDetailsI {
	
	public void inventoryList(JSONArray inventoryList);

	public void writeData();

	public void readData();

	public void defaultInventory();
}
