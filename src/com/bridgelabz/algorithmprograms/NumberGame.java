package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class NumberGame {
	static Scanner sc = new Scanner(System.in);
	int numberOfChance;
	public static void main(String[] args) {
		
		System.out.print("Enter a number :");
		int n = sc.nextInt();

		int chance =(int)Math.ceil(Math.sqrt(n));
		//int num = (int) Math.ceil(numberOfChance);
		//System.out.println("Chance :"+numberOfChance+" num :"+num);
		
		NumberGame game = new NumberGame();
		game.findNumber(chance,n);
		
		/*for(int i=0;i<array.length-1;i++) {
			System.out.print(array[i]+" ");
		}*/
	}
	private void findNumber(int chance, int n) {
		this.numberOfChance = chance;
		int[] array = new int[n];
		for(int i=0;i<array.length-1;i++) {
			array[i] = i+1;
		}
		System.out.println("\nThink a number between "+array[0]+" to "+(n-1));
		binarySearch(array,0,n-1);
	}
	public void binarySearch(int[] array,int low, int max) {
		boolean flag = true;
		while(numberOfChance>0 && low<=max) {
		
			int mid = (low + max) / 2;

			if (flag)
				System.out.println("\nPlease press 1 if your number is equal to " + array[mid]
						+ "\n\nOtherwise press 2 if your number is greater than " + array[mid]
						+ "\n\nOtherwise press 3 if your number is less than " + array[mid]);
			int n = sc.nextInt();

			switch (n) {
			case 2:
				low = mid + 1;
				binarySearch(array, low, max);
				numberOfChance--;
				break;

			case 3:
				max = mid - 1;
				binarySearch(array, low, max);
				numberOfChance--;
				break;
			case 1:
				System.out.println("\nCongratulation!!! Your number is :" + array[mid]);
				numberOfChance--;
				flag = false;
				break;
			}

		}
		
	}
	
	/*int[] numberArray;	//	array of numbers of given range
	Scanner scanner;	//	scanner to get user input
	int count = 0;	
	int  ans;	//	the number in mind
	int N;	//	range	
	double  maxCount = 0;	//	number of times question will be asked
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberGame findYourNumber = new NumberGame();
		findYourNumber.start();
	}
	void start() {
		scanner = new Scanner(System.in);
		System.out.print("Enter limit N: ");
		N = scanner.nextInt();

		numberArray = new int[N];	//	array initialisation
		//	fills the array 
		for(int i = 0; i < N; i++) {
			numberArray[i] = i;
		}
		
		//	calculates maximum count of questions
		maxCount = Math.ceil(Math.sqrt(N));
		System.out.println("Number of tries required to guess: " + ((int)maxCount));
		binarySearch(0, N-1);
	}
	void binarySearch(int first, int last) {
		if(count < maxCount) {
			int	middle = (first + last) / 2;
			count++;
			System.out.println("Is number between " + first  + " and " + middle + " ? if yes press 1 otherwise press 2");
			int temp = scanner.nextInt();
			if(temp==1) {
				change(middle+1 , last);
				binarySearch(first , middle);				
			}
			else if(temp==2){
				change(first , middle);
				binarySearch(middle + 1, last);
			}
		}
		else {
			for(int i : numberArray) {
				if(i != -1) {
					System.out.println("The number is: " + i);
				}
			}
		}
	}
	void change(int first , int last) {
		for(int i = first; i <= last; i++) {
			numberArray[i] = -1;
		}
	}*/
}
