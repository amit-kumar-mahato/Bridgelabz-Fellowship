/*
 * Purpose: To check whether given expression is Balanced or not
 * @author: Amit
 * @date: 08-11-2019 
 * 
 * 
**/
package com.bridgelabz.datastructure;

public class BalancedParentheses {
	
	public static void main(String[] args) {
		MyStack<Character> utility = new MyStack<>();
		String expression = "((5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
	
		char[] ch = expression.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == '(') {
				utility.push(ch[i]);
			}
			else if(ch[i] == ')') {
				utility.pop();
			}
		}
	
		int size = utility.size();
		System.out.println("Size :"+size);
		if(size>0) {
			System.out.println("Given Expression is not Balanced!!!");
		}
		else {
			System.out.println("Given Expression is Balanced!!!");
		}
	}
}
