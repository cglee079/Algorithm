package com.baekjoon.q01937;

import java.util.Scanner;

public class Main {
	int n;
	int dp[][];
	int map[][];

	public int DFS(int a, int b) {
		int dx[] = { 1, -1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };
		int xx;
		int yy;
		int max = 1;

		for (int i = 0; i < 4; i++) {
			xx = a + dx[i];
			yy = b + dy[i];

			if (xx > 0 && yy > 0 && xx <= n && yy <= n && map[xx][yy] > map[a][b]) {
				if (dp[xx][yy] != 1) {
					max = Math.max(max, dp[xx][yy] + 1);
				} else {
					max = Math.max(max, DFS(xx, yy) + 1);
				}
			}
		}

		dp[a][b] = max;

		return dp[a][b];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		map = new int[n + 1][n + 1];
		dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				map[i][j] = scan.nextInt();
				dp[i][j] = 1;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (dp[i][j] == 1) {
					DFS(i, j);
				}
			}
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				max = Math.max(dp[i][j], max);
			}
		}

		System.out.println(max);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
