package com.baekjoon.q01463;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int dp[][] = new int[n + 1][3];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < 3; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		dp[1][0] = 0;
		dp[1][1] = 0;
		dp[1][2] = 0;

		int min;
		for (int i = 2; i <= n; i++) {
			min = Math.min(dp[i - 1][0], dp[i - 1][1]);
			min = Math.min(min, dp[i - 1][2]);
			dp[i][0] = min + 1;

			if (i % 2 == 0) {
				min = Math.min(dp[i / 2][0], dp[i / 2][1]);
				min = Math.min(min, dp[i / 2][2]);
				dp[i][1] = min + 1;
			}
			if (i % 3 == 0) {
				min = Math.min(dp[i / 3][0], dp[i / 3][1]);
				min = Math.min(min, dp[i / 3][2]);
				dp[i][2] = min + 1;
			}
		}

		
		min = Math.min(dp[n][0], dp[n][1]);
		min = Math.min(min, dp[n][2]);
		
		System.out.println(min);
		
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
