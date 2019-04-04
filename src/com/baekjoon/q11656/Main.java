package com.baekjoon.q11656;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		int n = str.length();
		
		String[] subs = new String[n];
		for(int i = 0; i < str.length(); i++) {
			subs[i] = str.substring(i, n);
		}
		
		
		int min;
		for(int i = 0; i < n - 1; i++){
			min = i;
			for(int j = i + 1; j < n; j++) {
				if(subs[min].compareTo(subs[j]) > 0) {
					min = j;
				}
			}
			
			String temp;
			temp = subs[i];
			subs[i] = subs[min];
			subs[min] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(subs[i]);
		}
		
	}
}
