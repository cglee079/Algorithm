package com.baekjoon.q11053;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int dp[] = new int[n + 1];
		int arr[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = scan.nextInt();
		}

		int max;
		for (int i = 1; i <= n; i++) {
			max = 0;
			for (int j = 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					max = Math.max(dp[j], max);
				}
			}

			dp[i] = max + 1;
		}

		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = Math.max(result, dp[i]);
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
