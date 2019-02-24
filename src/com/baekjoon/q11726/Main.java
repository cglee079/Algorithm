package com.baekjoon.q11726;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int dp[] = new int[1001];

		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
		}

		System.out.println(dp[n]);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
