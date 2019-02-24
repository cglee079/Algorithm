package com.baekjoon.q02294;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n, k;
		int coins[];
		int dp[][];

		n = scan.nextInt();
		k = scan.nextInt();
		coins = new int[n + 1];
		dp = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			coins[i] = scan.nextInt();
		}

		Arrays.sort(coins);

		int coin = coins[1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= k; j++) {
				dp[i][j] = -1;
			}
		}

		for (int i = 1; i <= k; i++) {
			if (i % coin == 0) {
				dp[1][i] = i / coin;
			}
		}

		for (int i = 2; i <= n; i++) {
			coin = coins[i];
			for (int j = 1; j <= k; j++) {

				if (dp[i - 1][j] != -1) {
					dp[i][j] = dp[i - 1][j];
				}

				int c = coin;
				while (j - c > 0) {
					if (dp[i - 1][j - c] != -1) {
						if (dp[i][j] == -1) {
							dp[i][j] = dp[i - 1][j - c] + (c / coin);
						}
						dp[i][j] = Math.min(dp[i - 1][j - c] + (c / coin), dp[i][j]);
					}
					c += coin;
				}

				if (j == c) {
					dp[i][j] = Math.min((c / coin), dp[i][j]);
				}

			}
		}

		System.out.println(dp[n][k]);

	}

	public static void main(String[] args) {
		new Main().run();
	}
}