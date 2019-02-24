package com.baekjoon.q10844;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int dp[][] = new int[n + 1][10];

		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][1];
				}
				if (j > 0 && j < 9) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
				}

				if (j == 9) {
					dp[i][j] = dp[i - 1][j - 1];
				}
				
				dp[i][j] = dp[i][j] % 1000000000;
			}
		}

		int result = 0;
		for (int i = 0; i < 10; i++) {
			result = (result + dp[n][i])  % 1000000000;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
