package com.baekjoon.q02167;

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
				dp[i][j] = v[i][j] + dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1];
			}
		}

		int t = scan.nextInt();

		for (int k = 0; k < t; k++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int result = dp[x][y] - dp[i-1][y] - dp[x][j-1] + dp[i-1][j-1];
			System.out.println(result);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
