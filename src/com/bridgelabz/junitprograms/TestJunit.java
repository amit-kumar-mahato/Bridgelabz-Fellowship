package com.bridgelabz.junitprograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	@Test
	public void testSetup() {
		String str = "I am done with Juint Setup";
		assertEquals("I am done with Juint Setup", str);
	}
}
