package com.baekjoon.q11064;

import java.util.Scanner;

public class Main {
	int dp[][];

	public int count(int sx, int sy, int x, int y) {
		if (sx == x & sy == y) {
			return dp[x][y] = 1;
		}

		dp[sx][sy] = 1;

		int i = sx + 1;
		int j = sy;
		while (!(i >= x && j >= y)) {
			if (i > x) {
				i = sx;
				j++;
			}
			dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			i++;
		}

		return dp[x][y] = dp[x - 1][y] + dp[x][y - 1];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int k = scan.nextInt();
		int x, y;
		if (k != 0) {
			x = k / m;
			if (k % m != 0) {
				x = x + 1;
			}
			y = k - (m * (x - 1));
		} else {
			x = n;
			y = m;
		}

		dp = new int[n + 1][m + 1];
		int a = count(1, 1, x, y);
		
		dp = new int[n + 1][m + 1];
		int b = count(x, y, n, m);

		System.out.println(a * b);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
