package com.blbz.stockmanagement.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.blbz.stockmanagement.model.CompanyShare;
import com.blbz.stockmanagement.util.Utility;

public class CompanyShareController {

	

	public static CompanyShare companyDetails() {
		
		System.out.println("Enter Company Name");
		String cName = Utility.inputString();
		if(Utility.isStringOnlyAlphabet(cName)) {
			
		}
		
		System.out.println("Enter Company Symbol");
		String symbol = Utility.inputString();
		
		System.out.println("Enter Number of Share");
		int numberOfShare = Utility.inputinteger();
		
		
		System.out.println("Enter Price");
		double price = Utility.inputDouble();
		
		
		// will give us the current time and date 
	    LocalDateTime current = LocalDateTime.now(); 
	   // System.out.println("current date and time : "+ current); 
		// to print in a particular format 
	    DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");   
	    
	    String dateTime = current.format(format);   
	     
	    //System.out.println("in foramatted manner "+ dateTime); 
	    
	    CompanyShare companyShare = new CompanyShare(cName,symbol,numberOfShare,price,dateTime);
		return companyShare;
	}
	
	
}
