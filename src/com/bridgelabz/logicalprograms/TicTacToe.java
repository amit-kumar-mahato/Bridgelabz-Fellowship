/*
 * purpose : Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1
			is the Computer and the Player 2 is the user. Player 1 take Random Cell that is
			the Column and Row.
 * @author : Amit
 * @version : 1.0
 * @since : 26-10-2019
 *
 **/
package com.bridgelabz.logicalprograms;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class TicTacToe {

	// Grid variables
	// 0 for an empty square
	// 1 if the square contains X
	// 2 if the square contains O
	static int A1, A2, A3, B1, B2, B3, C1, C2, C3;
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String welcomeMessage = "Welcome to Tic-Tac-Toe. Please enter your first move: ";
		String playerMove = "";
		String computerMove ="";
		boolean isWonGame = false;
		
		// There are a maximum of nine place, so a for loop keeps track of
		// the number of place. The game is over after the ninth place.
		// Each time through the loop, both the human and the computer play.
		// So i is incremented in the body of the loop after the computer plays.
		
		for(int i=1;i<=9;i++) {
			//Player Turn
			playerMove = getMove(welcomeMessage);
			updateBoard(playerMove, 1);
			displayBoard();
			if(isGameWon()) {
				System.out.println("Congratulation! you won the match");
				isWonGame = true;
				break;
			}	
			
			//Computer Turn
			if(i<9) {
				computerMove = getComputerMove();
				System.out.println("Computer will play at "+ computerMove);
				updateBoard(computerMove, 2);
				displayBoard();
				if(isGameWon()) {
					System.out.println("Computer won the match!");
					isWonGame = true;
					break;
				}
				welcomeMessage = "Please enter your next move: ";
				i++;
			}
		}
		if (!isWonGame)
			System.out.println("Match Draw!");
	}
	
	private static String getMove(String welcomeMessage) {
		String play;
		System.out.println(welcomeMessage);
		do {
			play = sc.nextLine();
			if(!isValidPlay(play)) {
				System.out.println("That is not a valid turn");
			}
		}while(!isValidPlay(play));
		return play;
	}
	private static boolean isValidPlay(String play) {
		if(play.equalsIgnoreCase("A1") & A1 == 0)
			return true;
		if (play.equalsIgnoreCase("A2") & A2 == 0)
			return true;
		if (play.equalsIgnoreCase("A3") & A3 == 0)
			return true;
		if (play.equalsIgnoreCase("B1") & B1 == 0)
			return true;
		if (play.equalsIgnoreCase("B2") & B2 == 0)
			return true;
		if (play.equalsIgnoreCase("B3") & B3 == 0)
			return true;
		if (play.equalsIgnoreCase("C1") & C1 == 0)
			return true;
		if (play.equalsIgnoreCase("C2") & C2 == 0)
			return true;
		if (play.equalsIgnoreCase("C3") & C3 == 0)
			return true;
		return false;
	}
	
	private static void updateBoard(String play, int player) {
		if (play.equalsIgnoreCase("A1"))
			A1 = player;
		if (play.equalsIgnoreCase("A2"))
			A2 = player;
		if (play.equalsIgnoreCase("A3"))
			A3 = player;
		if (play.equalsIgnoreCase("B1"))
			B1 = player;
		if (play.equalsIgnoreCase("B2"))
			B2 = player;
		if (play.equalsIgnoreCase("B3"))
			B3 = player;
		if (play.equalsIgnoreCase("C1"))
			C1 = player;
		if (play.equalsIgnoreCase("C2"))
			C2 = player;
		if (play.equalsIgnoreCase("C3"))
			C3 = player;
	}
	
	private static void displayBoard() {
		String line = "";
		System.out.println();
		line = " " + getXO(A1) + " | " + getXO(A2) + " | " + getXO(A3);
		System.out.println(line);
		System.out.println("-----------");
		line = " " + getXO(B1) + " | " + getXO(B2) + " | " + getXO(B3);
		System.out.println(line);
		System.out.println("-----------");
		line = " " + getXO(C1) + " | " + getXO(C2) + " | " + getXO(C3);
		System.out.println(line);
		System.out.println();
	}

	private static String getXO(int square) {
		if(square == 1)
			return "X";
		if(square == 2)
			return "O";
		return " ";
	}
	
	private static boolean isGameWon() {
		if (isRowWon(A1, A2, A3))
			return true;
		if (isRowWon(B1, B2, B3))
			return true;
		if (isRowWon(C1, C2, C3))
			return true;
		if (isRowWon(A1, B1, C1))
			return true;
		if (isRowWon(A2, B2, C2))
			return true;
		if (isRowWon(A3, B3, C3))
			return true;
		if (isRowWon(A1, B2, C3))
			return true;
		if (isRowWon(A3, B2, C1))
			return true;
		return false;
	}

	private static boolean isRowWon(int a, int b, int c) {
		return ((a == b) & (a == c) & (a != 0));
	}
	
	private static String getComputerMove() {
		if (A1 == 0)
			return "A1";
		if (A2 == 0)
			return "A2";
		if (A3 == 0)
			return  "A3";
		if (B1 == 0)
			return  "B1";
		if (B2 == 0)
			return  "B2";
		if (B3 == 0)
			return  "B3";
		if (C1 == 0)
			return  "C1";
		if (C2 == 0)
			return  "C2";
		if (C3 == 0)
			return  "C3";
		return "";
	}
	
	/*public static int row,column;
	public static  Scanner sc = new Scanner(System.in);
	public static char[][] board = new char[3][3];
	public static char turn ='X';
	public static boolean result = false; 
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j] = '_';
			}
		}
		play();
	}

	private static void play() {
		boolean playing = true;
		while(playing) {
			System.out.println("Please enter a row and column :");
			row = sc.nextInt();
			column = sc.nextInt();
			board[row][column] = turn;
			if(isGameOver(row,column)) {
				playing = false; 
				result =true; 
				System.out.println("Game Over Player "+turn+" Wins"); 
			}
			displayBoard();
			if(turn == 'X')
				turn = 'O';
			else
				turn = 'X';
		}
		if(result == false)
			System.out.println("\nMatch Draw!!!");
	}
	
	private static void displayBoard() {
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				if(j==0)
					System.out.print("| ");
				System.out.print(board[i][j]+" | ");
			}
		}
		System.out.println();
	}

	private static boolean isGameOver(int row2, int column2) {
		if(board[row2][0]==board[row2][1] && board[row2][0]==board[row2][2])
			return true;
		if(board[0][column2]==board[1][column2] && board[0][column2]==board[2][column2])
			return true;
		if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[1][1]!='_')
			return true;
		if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1]!='_')
			return true;
		return false;
	}*/
}
