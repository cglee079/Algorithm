package com.baekjoon.q11060;

import java.util.Scanner;

public class Main {
	int dp[];
	int arr[];
	int n;

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		arr = new int[n + 1];
		dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = scan.nextInt();
			dp[i] = Integer.MAX_VALUE;
		}

		dp[n] = 0;
		
		int s, e;
		for (int i = n - 1; i >= 1; i--) {
			if (arr[i] == 0) {
				dp[i] = Integer.MAX_VALUE;
				continue;
			}
			
			s = i + 1;
			e = i + arr[i];

			if (e > n) {
				e = n;
			}

			for (int j = s; j <= e; j++) {
				if (dp[j] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[j] + 1, dp[i]);
				}
			}
		}

		int result = dp[1];
		if (result == Integer.MAX_VALUE) {
			result = -1;
		}

		System.out.println(result);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
