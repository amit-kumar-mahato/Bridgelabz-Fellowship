package coom.blbz.inventorymanagement.model;

/*
 * purpose : This class contains all the property 
 * @author : Amit
 * @version : 1.0
 * @since : 19-11-2019
 * 
 * */
public class InventoryDetails {
	
	private String name;
	private double weight;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
