package com.baekjoon.q09465;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		int n;
		int pt[][];
		int dp[][];
		for (int a = 0; a < t; a++) {

			n = scan.nextInt();
			pt = new int[n + 1][3];
			dp = new int[n + 1][3];

			for (int j = 1; j <= n; j++) {
				pt[j][1] = scan.nextInt();
			}

			for (int j = 1; j <= n; j++) {
				pt[j][2] = scan.nextInt();
			}

			for (int i = 1; i <= n; i++) {
				dp[i][0] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][2]);
				dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + pt[i][1];
				dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + pt[i][2];
			}
			
			System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
		}
	}

	public static void main(String[] args) {

		new Main().run();
	}

}
