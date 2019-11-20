package coom.blbz.inventorymanagement.controller;

import coom.blbz.inventorymanagement.service.InventoryI;
import coom.blbz.inventorymanagement.serviceimpl.InventoryImpl;
import coom.blbz.inventorymanagement.util.Utility;

/*
 * purpose : This class provide user interaction
 * @author : Amit
 * @version : 1.0
 * @since : 19-11-2019
 * 
 * */
public class InventoryController {
	public static void main(String[] args) {
		Utility utility = new Utility();
		InventoryI details = new InventoryImpl();
		
		System.out.println("Enter your choice");
		System.out.println("1. Add Inventory");
		System.out.println("2. Inventory List");
		System.out.println("3. Calculation");
		int option = utility.inputInteger();
		if(utility.validOption(option)) {
			switch (option) {
			case 1:
				System.out.println("Please choose which inventory you want to add");
				System.out.println("1.Rice");
				System.out.println("2.Wheat");
				System.out.println("3.Pulses");
				int selectedOption = utility.inputInteger();
				if(utility.validOption(selectedOption)) {
					details.writeData(selectedOption);
				}
				break;
			case 2:
				details.inventryList();
				break;
			case 3:
				System.out.println("Please choose which calculation you want ");
				System.out.println("1. Rice Inventory");
				System.out.println("2. Wheat Inventory");
				System.out.println("3. Pulses Inventory");
				System.out.println("4. Total inventory");
				int selected = utility.inputInteger();
				
				details.calculation(selected);
				break;

			default:
				System.out.println("Invalid Option!!!");
				break;
			}
		}
	}
}
