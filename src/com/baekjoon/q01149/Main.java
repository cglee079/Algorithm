package com.baekjoon.q01149;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d[][] = new int[3][1001];

		int dR;
		int dG;
		int dB;
		
		for(int i = 0; i < n; i++) {
			dR = scan.nextInt();
			dG = scan.nextInt();
			dB = scan.nextInt();
			
			if(i == 0) {
				d[0][i] = dR;
				d[1][i] = dG;
				d[2][i] = dB;
			} else {
				d[0][i] = Math.min(d[1][i-1], d[2][i-1]) + dR;
				d[1][i] = Math.min(d[0][i-1], d[2][i-1]) + dG;
				d[2][i] = Math.min(d[0][i-1], d[1][i-1]) + dB;
			}
		}
		
		int min;
		min = Math.min(d[0][n-1], d[1][n-1]);
		min = Math.min(d[2][n-1], min);
		
		System.out.println(min);
		
	}
}
