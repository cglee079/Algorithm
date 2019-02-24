package com.baekjoon.q01699;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int dp[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			dp[i] = i;

			for (int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
			}
		}

		System.out.println(dp[n]);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
