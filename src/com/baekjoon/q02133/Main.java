package com.baekjoon.q02133;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int dp[] = new int[N + 1];

		dp[2] = 3;
		for (int i = 3; i <= N; i++) {
			if (i % 2 == 1) {
				dp[i] = 0;
			} else {
				dp[i] = (dp[i - 2] + (dp[i - 2] / 2)) * 2 + dp[i - 2];
			}
		}

		System.out.println(dp[N]);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
