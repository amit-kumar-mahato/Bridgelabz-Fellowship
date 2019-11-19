/*
 * purpose : A program ​ Calendar.java that takes the month and year as command-line
				arguments and prints the Calendar of the month. Store the Calendar in an 2D Array,
				the first dimension the week of the month and the second dimension stores the day
				of the week.
 * @author : Amit
 * @version : 1.0
 * @since : 15-11-2019
 * 
 * */
package com.bridgelabz.datastructure;

import com.bridgelabz.util.Utility;
//import static com.bridgelabz.util.Utility.*;

public class Calender {

	public static void main(String[] args) {

		System.out.println("Calender ...");
		Utility.calender(11, 2019);

		System.out.println("Calender With MyQueue...");
		MyQueue<String> weekQ = new MyQueue<>();
		MyQueue<String> dateQ = new MyQueue<>();

		for (int i = 0; i < Utility.dayName.length; i++) {
			weekQ.enqueue(Utility.dayName[i]);
		}

		for (int i = 0; i < Utility.totalDays.length; i++) {
			for (int j = 0; j < Utility.totalDays[i].length; j++) {
				if(Utility.totalDays[i][j]<10) {
					dateQ.enqueue(String.valueOf(Utility.totalDays[i][j])+" ");
				}else {
					dateQ.enqueue(String.valueOf(Utility.totalDays[i][j]));
				}
			}
			dateQ.enqueue("\n");
		}
		
		while(weekQ.size()>0) {
			System.out.print(weekQ.dequeue()+"  ");
		}
		System.out.println();
		while(dateQ.size()>0) {
			String tmp=dateQ.dequeue();
			System.out.print((tmp.contains("-1")?"  ":tmp)+" ");
		}
		System.out.println("Calender With Stack...");
		MyStack<String> weekstk = new MyStack<>();
		MyStack<String> datestk = new MyStack<>();

		for (int i = Utility.dayName.length-1; i >=0 ; i--) {
			weekstk.push(Utility.dayName[i]);
		}

		for (int i = Utility.totalDays.length-1; i >=0 ; i--) {
			for (int j = Utility.totalDays[i].length-1; j >=0 ; j--) {
				if(Utility.totalDays[i][j]<10) {
					datestk.push(String.valueOf(Utility.totalDays[i][j])+" ");
				}else {
					datestk.push(String.valueOf(Utility.totalDays[i][j]));}
			}
			datestk.push("\n");
		}
		
		while(weekstk.size()>0) {
			System.out.print(weekstk.pop()+"  ");
		}
		while(datestk.size()>0) {
			String tmp=datestk.pop();
			System.out.print((tmp.contains("-1")?"  ":tmp)+" ");
		}

	}
}
