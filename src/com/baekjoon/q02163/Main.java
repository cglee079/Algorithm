package com.baekjoon.q02163;

import java.util.Scanner;

public class Main {
	int dp[][];
	int NONE = 10000000;

	public int find(int n, int m) {
		if (dp[n][m] == NONE) {
			int tm = m / 2;
			if (m % 2 == 0) {
				tm += 1;
			}

			for (int i = 1; i < tm; i++) {
				dp[n][m] = Math.min(dp[n][m], find(n, i) + find(n, m - i) + 1);
			}

			tm = n / 2;
			if (n % 2 == 0) {
				tm += 1;
			}
			for (int i = 1; i < tm; i++) {
				dp[n][m] = Math.min(dp[n][m], find(i, m) + find(n - i, m) + 1);
			}

			dp[m][n] = dp[n][m];
		}

		return dp[n][m];

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int MAX = N;

		if (M > N) {
			MAX = M;
		}

		dp = new int[MAX + 1][MAX + 1];

		for (int i = 0; i <= MAX; i++) {
			for (int j = 0; j <= MAX; j++) {
				dp[i][j] = NONE;
			}
		}

		dp[1][1] = 0;
		for (int i = 2; i <= MAX; i++) {
			dp[i][1] = i - 1;
			dp[1][i] = i - 1;
		}

		int result = find(N, M);

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
