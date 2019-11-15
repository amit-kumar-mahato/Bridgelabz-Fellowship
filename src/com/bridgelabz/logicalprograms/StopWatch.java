/*
 * purpose : Write a Stopwatch Program for measuring the time that elapses between
			the start and end clicks
 * @author : Amit
 * @version : 1.0
 * @since : 26-10-2019
 */
package com.bridgelabz.logicalprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class StopWatch {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Please enter 1 to start StopWatch : ");
		int t1 = utility.inputInteger();
		
		String[] parts1 = null;
		int h1 = 0,m1 = 0,s1 = 0,h2 = 0,m2 = 0,s2 = 0;;
		String[] parts2 = null;
		if(t1==1) {
			
			//getInstance method will return date and time
			Calendar cal = Calendar.getInstance();
			
			//Using SimpleDateFormat class, we can get the time and date in a format
			//Here we need only time so we set our time format HH:mm:ss
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        
	        System.out.println("Start Time : "+sdf.format(cal.getTime()));
	        
	        String startTime = sdf.format(cal.getTime());
	        
	        parts1 = startTime.split(":");
	        h1 = Integer.parseInt(parts1[0]);
	        m1 = Integer.parseInt(parts1[1]);
	        s1 = Integer.parseInt(parts1[2]);
		}
		
		System.out.print("Please enter 2 to stop StopWatch : ");
		int t2 = utility.inputInteger();
		
		if(t2 == 2) {
			
			Calendar cal = Calendar.getInstance();
			
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        
	        System.out.println("Stop Time : "+sdf.format(cal.getTime()));
	        
	        String stopTime = sdf.format(cal.getTime());
	        
	        parts2 = stopTime.split(":");
	        h2 = Integer.parseInt(parts2[0]);
	        m2 = Integer.parseInt(parts2[1]);
	        s2 = Integer.parseInt(parts2[2]);
		}
		
		int minutes = 0;
		int seconds = 0;
		
		if(h2>=h1) {
			if(m1>m2) 
				minutes = m1-m2;
			else
				minutes = m2-m1;
			if(s1>s2)
				seconds = s1-s2;
			else
				seconds = s2-s1;
			
			System.out.println("Elapsed Time : "+(h2-h1)+" Hours :"+minutes+" Minutes : "+seconds+" Seconds");	
		}
	}
}
