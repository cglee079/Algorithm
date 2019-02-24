package com.baekjoon.q11057;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int dp[][] = new int[n + 1][10];

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					dp[i][j] = (dp[i][j] + dp[i - 1][k]) % 10007;
				}
			}
		}

		int result = 0;
		for (int i = 0; i < 10; i++) {
			result += dp[n][i] % 10007;
		}

		System.out.println(result  % 10007);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
