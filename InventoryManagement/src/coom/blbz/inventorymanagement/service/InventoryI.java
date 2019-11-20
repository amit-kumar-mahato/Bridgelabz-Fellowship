package coom.blbz.inventorymanagement.service;
/*
 * purpose : This interface contains only methods and will provide the implementation of these methods in Inventoryimpl class
 * @author : Amit
 * @since : 19-11-2019
 * 
 * */
public interface InventoryI {

	void writeData(int selectedOption);

	void inventryList();

	void calculation(int selected);

}
