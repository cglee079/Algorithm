package com.baekjoon.q09252;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		String aa = scan.nextLine();
		String bb = scan.nextLine();

		char[] a = aa.toCharArray();
		char[] b = bb.toCharArray();
		int dp[][] = new int[aa.length() + 1][bb.length() + 1];

		int max = 0;
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < aa.length(); i++) {
			for (int j = 0; j < bb.length(); j++) {
				if (a[i] == b[j]) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}

				if (max < dp[i + 1][j + 1]) {
					max = dp[i + 1][j + 1];
					maxI = i;
					maxJ = j;
				}
			}
		}
		
		int i = maxI;
		int j = maxJ;
		String output = "";
		while(i >= 0 && j >= 0) {
			if(dp[i+1][j+1] == dp[i+1][j]) {
				j--;
			} else if (dp[i+1][j+1] == dp[i][j+1]) {
				i--;
			} else { //dp[i+1][j+1] == dp[i][j]
				output = a[i] + output;
				i--;
				j--;
			}
		}

		System.out.println(max);
		System.out.println(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

