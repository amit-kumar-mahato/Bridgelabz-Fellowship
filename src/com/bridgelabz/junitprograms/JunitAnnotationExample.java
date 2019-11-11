package com.bridgelabz.junitprograms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotationExample {
	
	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Using @BeforeClass, execute before all the test cases");
	}
	
	@Before
	public void m2() {
		list = new ArrayList<String>();
		System.out.println("Using @Before, execute before each test cases");
	}
	
	@AfterClass
	public static void m3() {
		System.out.println("Using @AfterClass, executer after all the test cases");
	}
	
	@After
	public void m4() {
		list.clear();
		System.out.println("Using @After, execute after each test cases");
	}
	
	@Test
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}
	
	@Ignore
	public void m6() {
		System.out.println("Using @Ignore, this execution is ignored");
	}
	
	@Test(timeout = 10)
	public void m7() {
		System.out.println("Using @Test(timeout), it can be used to enforce timeout in Junit4 test cases");
	}
	
	@Test(expected=NoSuchMethodException.class)
	public void m8() {
		System.out.println("Using @Test(expected), it will check for specified exception during its execution");
		
	}
}
