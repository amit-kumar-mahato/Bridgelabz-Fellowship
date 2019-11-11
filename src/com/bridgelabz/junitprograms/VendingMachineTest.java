package com.bridgelabz.junitprograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineTest {
	int amount = 1000;
	
	VendingMachine machine = new VendingMachine(amount);
	
	@Test
	public void getChangeTest() {
		System.out.println("Machine give change :");
		//System.out.println("Result :"+result+" Size :"+result.size());
		//assertArrayEquals(expected, result);
		if(amount>0)
			assertEquals(1, machine.getChange(amount));
		else
			assertEquals(false, machine.getChange(0));
	}

	/*@Test
	public void getChangeNegativeTest() {
		assertEquals(false, machine.getChange(0));
	}*/

}
