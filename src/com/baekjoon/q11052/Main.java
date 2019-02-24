package com.baekjoon.q11052;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int dp[] = new int[n + 1];
		int p[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			p[i] = scan.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 1; j < i; j++) {
				if (max < dp[j] + dp[i - j]) {
					max = dp[j] + dp[i - j];
				}
			}

			if (max < p[i]) {
				max = p[i];
			}
			
			dp[i] = max;
		}

		System.out.println(dp[n]);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
