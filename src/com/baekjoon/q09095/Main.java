package com.baekjoon.q09095;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		int n;
		int dp[];
		for (int k = 0; k < t; k++) {
			n = scan.nextInt();
			dp = new int[12];
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;

			for (int i = 4; i <= n; i++) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}

			System.out.println(dp[n]);

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
