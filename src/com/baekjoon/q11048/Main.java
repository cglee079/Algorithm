package com.baekjoon.q11048;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int v[][] = new int[n + 1][m + 1];
		int dp[][] = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				v[i][j] = scan.nextInt();
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Math.max(Math.max(dp[i - 1][j], dp[i - 1][j - 1]), dp[i][j - 1]) + v[i][j];
			}
		}

		System.out.println(dp[n][m]);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
