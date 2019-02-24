package com.baekjoon.q15990;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		int n;
		int M = 1000000009;
		int dp[][];
		int last = 3;
		dp = new int[100001][4];

		dp[1][1] = 1;
		dp[1][2] = 0;
		dp[1][3] = 0;

		dp[2][1] = 0;
		dp[2][2] = 1;
		dp[2][3] = 0;

		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;

		for (int k = 0; k < t; k++) {
			n = scan.nextInt();

			if (last < n) {
				for (int i = last + 1; i <= n; i++) {
					dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % M;
					dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % M;
					dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % M;
				}
				last = n;
			}

			int result;
			result = (dp[n][1] + dp[n][2]) % M;
			result = (result + dp[n][3]) % M;

			System.out.println(result);

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
