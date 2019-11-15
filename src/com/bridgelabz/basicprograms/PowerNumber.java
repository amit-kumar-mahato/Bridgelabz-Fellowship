package com.bridgelabz.basicprograms;

import com.bridgelabz.util.Utility;
class PowerNumber{
	public static void main(String[] artgs){
		Utility utility = new Utility();
		
		System.out.println("Enter a value for n :");
		int n = utility.inputInteger();
		
		if(n>=0 && n<=31){
			int[] array = new int[n+1];
			array = utility.power(n);
			
			//It will show power of 2 upto n 
			for(int i=0;i<array.length;i++){
				System.out.println("2 * "+i+" = "+ array[i]);
			}
		}
		else
			System.out.println(" N value must be greater than 0 and less than 32");
	}
}