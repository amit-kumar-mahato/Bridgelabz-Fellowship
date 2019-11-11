/*
 * purpose : Flip Coin and print percentage of Heads and Tails
 * @author : Amit
 * @version : 1.0
 * @since :	09-11-2019
 * 
 * */
package com.bridgelabz.basicprograms;

import java.util.*;
import java.lang.Math.*;
class FlipCoin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Times to Flip the coin :");
		int count = sc.nextInt();
		int numberOfHeads = 0;
		int numberOfTails = 0;
		
		if(count>0) {
			for(int i=0;i<count;i++){
				//random() method will return double value in the range 0 to 1
				if(Math.random()<0.5){
					numberOfTails++;
				}
				else{
					numberOfHeads++;
				}
			}
			//Calculate the percentage of Heads vs Tails
			int heads_perentage = (numberOfHeads*100)/count;
			int tails_percentage = (numberOfTails*100)/count;
			
			System.out.print("Tails Percentage = "+tails_percentage+"%" + "\nHeads Percentage = "+heads_perentage+"%");

		}
		else
			System.out.println("Number should be positive integer!!!");
	}
}