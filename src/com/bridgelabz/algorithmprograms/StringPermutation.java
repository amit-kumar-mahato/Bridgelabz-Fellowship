package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "ABC";
		int length = str.length();
		 permutation(str,0,length);
	}

	private static void permutation(String str, int start, int end) {
		if(start == end-1)
			System.out.println(str);
		else {
			for(int i=start;i<end;i++) {
				str = swapString(str,start,i);
				permutation(str, start+1, end);
				str = swapString(str,start,i);
			}
		}
	}

	private static String swapString(String str, int start, int i) {
		char[] ch = str.toCharArray();
		char temp = ch[start];
		ch[start] = ch[i];
		ch[i] = temp;
		
		return String.valueOf(ch);
	}
}
