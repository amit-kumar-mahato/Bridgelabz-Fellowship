package com.bridgelabz.junitprograms;

public class JunitMessage {
	
	private String message;

	public JunitMessage(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String printHiMessage() {
		message = "Hi!"+message;
		System.out.println(message);
		return message;
	}

}
