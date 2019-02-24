package com.baekjoon.q01309;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int k = n;

		long dp[][] = new long[(k) + 1][3];

		dp[1][0] = 1;
		dp[1][1] = 1;
		dp[1][2] = 1;

		int m = 9901;
		for (int i = 2; i <= (k); i++) {
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % m;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % m;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % m;
		}

		System.out.println((dp[k][0] + dp[k][1] + dp[k][2]) % m);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
