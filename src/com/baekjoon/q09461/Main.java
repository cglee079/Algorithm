package com.baekjoon.q09461;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		long dp[] = new long[100];

		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 2;
		dp[4] = 2;

		for (int i = 5; i < 100; i++) {
			dp[i] = dp[i - 1] + dp[i - 5];
		}

		int t = scan.nextInt();
		
		for (int i = 0; i < t; i++) {
			System.out.println(dp[scan.nextInt() - 1]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
