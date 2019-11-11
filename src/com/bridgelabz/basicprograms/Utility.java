package com.bridgelabz.basicprograms;

public class Utility {
	/*
	 * Function to check for LeapYear
	 * @param number the year to check LeapYaer
	 * 
	 * @return integer
	 * 
	 * */
	public int checkLeapYear(String year) {
		
		int year1 = Integer.parseInt(year);
		// Condition to check Leap year
		if (year1 % 4 == 0 || year1 % 400 == 0 || year1 % 100 == 0)
			return year1;
		else
			return year1;
		
	}

	/*
	 * Function to find power of 2
	 * @param type number
	 * 
	 * @return integer
	 * 
	 * */
	public int[] power(int n) {
		int[] array = new int[n+1];
		for(int i=0;i<=n;i++){
			//System.out.println("2 * "+i+" = "+ Math.pow(2,i));
			int value = (int)Math.pow(2, i);
			System.out.println(value);
			array[i] = value;
		}
		return array;
	}
	
	/*
	 * Function to compute 1/1 + 1/2 + 1/3 + ... + 1/N
	 * @param type number 
	 * 
	 * @return float
	 * 
	 * */
	
	public float harmonicNumber(int n) {
		float result = 0f;
		for(int i=1; i<=n; i++){
			//System.out.print(1+"/"+i+" ");
			//Calculating Nth Harmonic value
			result = result+(float)1/i;
			//System.out.println("Result :"+result);
		}
		return result;
	}
}
