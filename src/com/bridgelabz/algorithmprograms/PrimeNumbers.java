package com.bridgelabz.algorithmprograms;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		for(int i=2;i<=1000;i++) {
			checkForPrimeNumber(i);
		}
	}

	private static void checkForPrimeNumber(int n) {
		boolean result = false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				result = true;
				break;
			}
		}
		if(result == false)
			System.out.print(n+" ");
	}
}
