package com.baekjoon.q05557;

import java.util.Scanner;

public class Main {
	int n;
	int arr[];
	long dp[][];
	int result;

	public long count(int sum, int index) {

		if (!(sum >= 0 && sum <= 20)) {
			return 0;
		}

		if (index == (n - 1)) {
			if (sum == result) {
				dp[sum][index] = 1;
			} else {
				dp[sum][index] = 0;
			}
		}

		if (dp[sum][index] == -10) {
			long a = count(sum + arr[index + 1], index + 1);
			long b = count(sum - arr[index + 1], index + 1);
			dp[sum][index] = a + b;
		}

		return dp[sum][index];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		arr = new int[n];
		dp = new long[22][n];
		for (int i = 1; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < 22; i++) {
			for (int j = 0; j < n; j++) {
				dp[i][j] = -10;
			}
		}

		result = scan.nextInt();

		System.out.println(count(arr[1], 1));

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
