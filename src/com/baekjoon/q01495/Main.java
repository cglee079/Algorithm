package com.baekjoon.q01495;

import java.util.Scanner;

public class Main {
	int N;
	int S;
	int M;
	int dp[][];
	int gap[];

	public int calculate(int num, int index) {
		if (num < 0 || num > M) {
			return -1;
		}

		if (index == N) {
			dp[num][index] = num;
		}

		if (dp[num][index] == -2) {
			int a, b, c1, c2;
			a = num + gap[index + 1];
			b = num - gap[index + 1];

			c1 = calculate(a, index + 1);
			c2 = calculate(b, index + 1);

			dp[num][index] = Math.max(c1, c2);
		}

		return dp[num][index];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		S = scan.nextInt();
		M = scan.nextInt();

		dp = new int[M + 1][N + 1];
		gap = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			gap[i] = scan.nextInt();
		}

		for (int i = 0; i <= M; i++) {
			for (int j = 0; j <= N; j++) {
				dp[i][j] = -2;
			}
		}

		System.out.println(calculate(S, 0));

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
