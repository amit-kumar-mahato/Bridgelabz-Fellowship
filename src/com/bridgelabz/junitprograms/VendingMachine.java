package com.bridgelabz.junitprograms;

import java.util.ArrayList;

public class VendingMachine {
	
	static int i=0;
	private int notes[] = {1000, 500, 100, 50, 20, 10, 5, 2,1};
	private int amount;
	int rem = 0;
	
	ArrayList list = new ArrayList<>();
	int count=0;
	
	public VendingMachine(int amount) {
		this.amount = amount;
	}
	
	public int getChange(int amount){
		
		for(int i=0;i<notes.length;i++) {
			if(amount>=notes[i]) {
				count++;
				int numberOfNotes = amount/notes[i];
				rem = amount%notes[i];
				amount = rem;
				list.add(notes[i]);
				System.out.println(notes[i]+" "+numberOfNotes);
				System.out.println("Count :"+count);
			}
		}
		return count;
	}
}
