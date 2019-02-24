package com.baekjoon.q02438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i, j = 0;
		for(i = 0; i < n; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
