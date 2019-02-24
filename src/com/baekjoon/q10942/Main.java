package com.baekjoon.q10942;

import java.util.Scanner;

public class Main {
	int arr[];
	int dp[][];

	public int isFalindlom(int a, int b) {
		if (a > b) {
			return 2;
		}

		if (dp[a][b] != 0) {
			return dp[a][b];
		} else {
			if (arr[a] != arr[b]) {
				dp[a][b] = 1;
			} else {
				dp[a][b] = isFalindlom(a + 1, b - 1);
			}
			return dp[a][b];
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		arr = new int[n + 1];
		dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			dp[i][i] = 2;
			arr[i] = scan.nextInt();
		}

		int k = scan.nextInt();

		int a, b;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < k; i++) {
			a = scan.nextInt();
			b = scan.nextInt();

			if (dp[a][b] == 0) {
				isFalindlom(a, b);
			}

			sb.append(dp[a][b] - 1);
			sb.append('\n');

		}

		System.out.println(sb);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
