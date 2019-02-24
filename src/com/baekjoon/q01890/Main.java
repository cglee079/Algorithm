package com.baekjoon.q01890;

import java.util.Scanner;

public class Main {
	int n;
	int map[][];
	long dp[][];

	public long findRoot(int x, int y) {
		if (dp[x][y] == -1) {
			int dist = map[x][y];
			long count = 0;

			if (dist == 0) {
				dp[x][y] = 0;
			}

			if (x + dist <= n && dist != 0) {
				count += findRoot(x + dist, y);
			}

			if (y + dist <= n && dist != 0) {
				count += findRoot(x, y + dist);
			}

			dp[x][y] = count;
		}

		return dp[x][y];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		map = new int[n + 1][n + 1];
		dp = new long[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				map[i][j] = scan.nextInt();
				dp[i][j] = -1;
			}
		}

		dp[n][n] = 1;
		findRoot(1, 1);

		System.out.println(dp[1][1]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
