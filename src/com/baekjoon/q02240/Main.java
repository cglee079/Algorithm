package com.baekjoon.q02240;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		int W = scan.nextInt();
		int tree[] = new int[T + 1];
		int dp[][][] = new int[T + 1][W + 1][3];

		dp[0][0][1] = 0;
		dp[0][0][2] = 0;
		tree[1] = scan.nextInt();
		if (tree[1] == 1) {
			dp[1][0][1] = 1;
			dp[1][0][2] = 0;
			dp[1][1][1] = 0;
			dp[1][1][2] = 1;
		}

		if (tree[1] == 2) {
			dp[1][0][1] = 0;
			dp[1][0][2] = 0;
			dp[1][1][1] = 0;
			dp[1][1][2] = 1;
		}

		for (int i = 2; i <= T; i++) {
			tree[i] = scan.nextInt();

			if (tree[i] == 1) {
				dp[i][0][1] = dp[i - 1][0][1] + 1;
				dp[i][0][2] = dp[i - 1][0][2];
				for (int j = 1; j <= W && j < i; j++) {
					dp[i][j][1] = Math.max(dp[i - 1][j][1] + 1, dp[i - 1][j - 1][2] + 1);
					dp[i][j][2] = dp[i - 1][j][2];
				}
			}

			if (tree[i] == 2) {
				dp[i][0][1] = dp[i - 1][0][1];
				for (int j = 1; j <= W && j < i; j++) {
					dp[i][j][1] = dp[i - 1][j][1];
					dp[i][j][2] = Math.max(dp[i - 1][j][2] + 1, dp[i - 1][j - 1][1] + 1);
				}
			}
		}

		int result = 0;
		for (int i = 0; i <= W; i++) {
			result = Math.max(dp[T][i][1], result);
			result = Math.max(dp[T][i][2], result);
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
