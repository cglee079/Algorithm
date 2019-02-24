package com.baekjoon.q02169;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int m;
	int dp[][];
	int v[][];
	int dx[] = { 0, 1, 0 };
	int dy[] = { 1, 0, -1 };
	boolean visit[][];
	int NONE = Integer.MIN_VALUE;

	public int dfs(int x, int y) {
		int xx, yy;

		if (dp[x][y] == NONE || (dp[x][y] != NONE && visit[x][y] == true)) {
			for (int i = 0; i < 3; i++) {
				xx = x + dx[i];
				yy = y + dy[i];

				if (xx > 0 && xx <= n && yy > 0 && yy <= n && visit[x][y] == false) {
					visit[x][y] = true;
					 if(dp[x][y] < dfs(xx, yy) + v[x][y]) {
						 dp[x][y] = dfs(xx, yy) + v[x][y];
					 }
					visit[x][y] = false;
				}
			}
		}
		
		return dp[x][y];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();

		v = new int[n + 1][m + 1];
		dp = new int[n + 1][m + 1];
		visit = new boolean[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				v[i][j] = scan.nextInt();
				dp[i][j] = NONE;
			}
		}

		dp[n][m] = v[n][m];

		dfs(1, 1);

		for (int i = 0; i <= n; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
		System.out.println(dp[1][1]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
