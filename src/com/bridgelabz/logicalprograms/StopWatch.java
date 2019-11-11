package com.bridgelabz.logicalprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class StopWatch {
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter time to start the StopWatch in this format(hh:mm:ss) : ");
		String startTime = sc.next();
		LocalTime localTime = LocalTime.parse(startTime);
		String string = String.valueOf(localTime);
		String[] t1 = string.split(":");
		int h1 = Integer.parseInt(t1[0]);
		int m1 = Integer.parseInt(t1[1]);
		int s1 = Integer.parseInt(t1[2]);
		
		System.out.println("\nPlease enter time to stop the StopWatch in this format(hh:mm:ss) : ");
		String endTime = sc.next();
		LocalTime localTime2 = LocalTime.parse(endTime);
		String s = String.valueOf(localTime2);
		String[] t = s.split(":");
		int h2 = Integer.parseInt(t[0]);
		int m2 = Integer.parseInt(t[1]);
		int s2 = Integer.parseInt(t[2]);
		
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
		else
			System.out.println("Stop time should be greater than start time");
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter 1 to start StopWatch : ");
		int t1 = sc.nextInt();
		
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
		int t2 = sc.nextInt();
		
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
