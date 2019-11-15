/*
 * purpose : Simulates a gambler who start with $stake and place fair $1 bets until
				he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
				times he/she wins and the number of bets he/she makes.
 * @author : Amit
 * @version : 1.0
 * @since : 26-10-2019
 * */
package com.bridgelabz.logicalprograms;

import com.bridgelabz.util.Utility;

public class Gambler {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter $Stake Amount :");
		int stakeAmount = utility.inputInteger();
		System.out.println("Enter $Goal Amount :");
		int goalAmount = utility.inputInteger();
		System.out.println("Enter Number of times tried :");
		int tried = utility.inputInteger();
		
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
