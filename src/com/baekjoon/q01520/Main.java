package com.baekjoon.q01520;

import java.util.Scanner;

public class Main {
	int n, m;
	int map[][];
	long dp[][];
	int dx[] = { 1, -1, 0, 0 };
	int dy[] = { 0, 0, 1, -1 };

	public long find(int x, int y) {
		if (x == n && y == m) {
			return 1;
		}

		int xx, yy;

		int count = 0;
		for (int i = 0; i < 4; i++) {
			xx = x + dx[i];
			yy = y + dy[i];

			if (xx > 0 && yy > 0 && xx <= n && yy <= m && map[x][y] > map[xx][yy]) {
				if (dp[xx][yy] != -1) {
					count += dp[xx][yy];
				} else {
					count += find(xx, yy);
				}
			}
		}

		dp[x][y] = count;
		
		return count;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();
		map = new int[n + 1][m + 1];
		dp = new long[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				dp[i][j] = -1;
			}
		}

		System.out.println(find(1, 1));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
