package com.blbz.idm.controller;

import com.blbz.idm.service.InventoryDetailsI;
import com.blbz.idm.serviceimpl.InventoryDetailsImpl;

public class InventoryDetailsController {
	
	public static void main(String[] args)  {
		
		InventoryDetailsI details = new InventoryDetailsImpl();
		
		details.defaultInventory();
		details.readData();
	}
}

