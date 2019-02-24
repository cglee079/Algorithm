package com.baekjoon.q02225;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int dp[][] = new int[n + 1][k + 1];
		int m = 1000000000;

		for (int i = 0; i <= n; i++) {
			dp[i][1] = 1;
		}

		for (int i = 1; i <= k; i++) {
			dp[0][i] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 2; j <= k; j++) {
				for (int u = 0; u <= i; u++) {
					dp[i][j] = (dp[i][j] + dp[u][j - 1]) % m;
				}
			}
		}
		
		System.out.println(dp[n][k]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
