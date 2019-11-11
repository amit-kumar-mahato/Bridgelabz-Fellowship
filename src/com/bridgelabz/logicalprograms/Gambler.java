package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter $Stake Amount :");
		int stakeAmount = sc.nextInt();
		System.out.println("Enter $Goal Amount :");
		int goalAmount = sc.nextInt();
		System.out.println("Enter Number of times tried :");
		int tried = sc.nextInt();
		//int totalAmount = stakeAmount;
		int numberOfWins = 0;
		int numberofBets = 0;
		int numberOfLoss = 0;
		
		for(int i=0;i<tried;i++) {
			int totalAmount = stakeAmount;
			System.out.println("Total Amount : "+totalAmount);
			while(totalAmount > 0 && totalAmount < goalAmount) {
				numberofBets++;
				if(Math.random() < 0.5) {
					totalAmount++;
				}
				else {
					totalAmount--;
				}
			}
			if(totalAmount == goalAmount)
				numberOfWins++;
			else
				numberOfLoss++;
		}
		
		double winPercentage = (numberOfWins*100)/tried;
		double lossPercentage = (numberOfLoss*100)/tried;
		double average = (1.0*numberofBets)/tried;
		
		System.out.println("Average of Results : "+average);
		System.out.println("Number of Wins = "+numberOfWins+" \nWin % = "+winPercentage+" And Loss % = "+lossPercentage);
	}

}
