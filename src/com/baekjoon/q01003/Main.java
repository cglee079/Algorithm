package com.baekjoon.q01003;

import java.util.Scanner;

public class Main {
	int dp[][] = new int[41][2];

	public int[] fibo(int n) {
		if (!(dp[n][0] == 0 && dp[n][1] == 0)) {
			return dp[n];
		} else {
			dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
			dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];

			return dp[n];
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;

		for (int k = 0; k < t; k++) {
			int n = scan.nextInt();
			int ar[] = fibo(n);
			System.out.println(ar[0] + " " + ar[1]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
