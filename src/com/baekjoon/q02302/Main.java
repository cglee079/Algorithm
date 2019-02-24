package com.baekjoon.q02302;

import java.util.Scanner;

public class Main {
	int dp[];
	int vip[];

	public int fibo(int n) {
		if (dp[n] == 0) {
			dp[n] = fibo(n - 1) + fibo(n - 2);
		}

		return dp[n];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		dp = new int[45];
		dp[1] = 1;
		dp[2] = 1;

		vip = new int[45];

		int k = scan.nextInt();

		for (int i = 1; i <= k; i++) {
			vip[i] = scan.nextInt();
		}

		vip[k + 1] = n + 1;

		int sum = 1;

		int j = 1;
		int endA = 0;
		int endB = 0;

		while (j <= k + 1) {
			endA = endB;
			endB = vip[j];

			sum *= fibo(endB - endA);
			j++;
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
