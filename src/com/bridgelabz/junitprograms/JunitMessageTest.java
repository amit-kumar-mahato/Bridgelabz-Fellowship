package com.bridgelabz.junitprograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitMessageTest {

	String message ="Amit";
	JunitMessage junitMessage = new JunitMessage(message);
	
	@Test
	public void testJunitPrintMessage() {
		System.out.println("Junit Message is Printing ");
		assertEquals(message, junitMessage.printMessage());
	}
	
	@Test
	public void testjunitPrintHiMessage() {
		message = "Hi!"+message;
		System.out.println("Junit Hi Message is Printing ");
		assertEquals(message, junitMessage.printHiMessage());
	}
}
