package com.blbz.stockmanagement.controller;

import com.blbz.stockmanagement.model.StockPortfolio;
import com.blbz.stockmanagement.util.MyLinkedList;
import com.blbz.stockmanagement.util.Utility;

/*
 * Purpose: Print the Stock Report with total value of each Stock and total value of stock
 * @author: Amit
 * @since: 24-11-2019
 * 
 * */
public class StockReportController {
	
	static MyLinkedList<StockPortfolio> list;
	
	public static void main(String[] args) {

		StockReportController report = new StockReportController();	//	class object
		StockReportController.getStockData();
		report.printReport();
	}

	/**
	 * gets user input of stock data
	 * @param-type: Takes no argument
	 * @return-type: Doesn't return anything
	 */
	static void getStockData() {
		System.out.println("Enter number of stocks: ");
		int count = Utility.inputinteger();
		list = new MyLinkedList<StockPortfolio>();
		
		for(int i = 0; i < count; i++) {
			System.out.println("Enter stock name, number of shares and share price: ");
			String name = Utility.inputString();
			int numberOfShares = Utility.inputinteger();
			int price = Utility.inputinteger();
			StockPortfolio stock = new StockPortfolio(name, numberOfShares, price);
			list.add(stock);
		}
		Utility.scannerClose();
	}
	
	/**
	 * Print the Stock Report
	 * @param-type: Takes no argument
	 * @return-type: Doesn't return anything
	 * 
	 */
	void printReport() {
		int totalValue = 0;
		
		System.out.println("----------STOCK REPORT----------");
		System.out.println("\nName\tShares\tPrice\tValue");
		while(!list.isEmpty()) {
			StockPortfolio folio = list.pop();
			totalValue += folio.getValue();
			System.out.println(folio.getName() + "\t" + folio.getNumberOfShares()
					+ "\t" + folio.getPrice() + " \t" + folio.getValue());
		}
		System.out.println("\nTotal stock value is: " + totalValue);
	}

}
