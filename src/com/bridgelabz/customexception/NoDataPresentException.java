package com.bridgelabz.customexception;

public class NoDataPresentException extends Exception{

	public String getMessage() {
		return "Doesn't contain any data";
	}
}
