package com.baekjoon.q10769;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();

		char[] c = str.toCharArray();
		int n = c.length;
		int happy = 0;
		int sad = 0;
		for(int i = 2; i < n; i++) {
			if(c[i] == ')' && c[i-1] == '-' && c[i-2] == ':') {
				happy++;
			}
			if(c[i] == '(' && c[i-1] == '-' && c[i-2] == ':') {
				sad++;
			}
		}
		
		String result = "";
		if(happy == 0 && sad == 0) {
			result = "none";
		} else if(happy > sad) {
			result = "happy";
		} else if(happy == sad) {
			result = "unsure";
		} else {
			result = "sad";
		}
		
		System.out.println(result);
		
	}
}
