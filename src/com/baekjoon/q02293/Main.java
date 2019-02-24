package com.baekjoon.q02293;

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
		for (int i = 1; i <= k; i++) {
			if (i % coin == 0) {
				dp[1][i] = 1;
			}
		}

		for (int i = 2; i <= n; i++) {
			coin = coins[i];
			for (int j = 1; j <= k; j++) {
				dp[i][j] = dp[i - 1][j];

				int c = coin;
				while (j - c > 0) {
					dp[i][j] += dp[i - 1][j - c];
					c += coin;
				}

				if (j == c) {
					dp[i][j] += 1;
				}

			}
		}

		System.out.println(dp[n][k]);

	}

	public static void main(String[] args) {
		new Main().run();
	}
}

