package com.baekjoon.q14051;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int pay[] = new int[n + 1];
		int time[] = new int[n + 1];
		int dp[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			time[i] = scan.nextInt();
			pay[i] = scan.nextInt();
		}

		int stime;
		int max;
		for (int i = 1; i <= n; i++) {

			stime = i - 4;
			if (stime <= 1) {
				stime = 1;
			}

			max = 0;
			for (int j = stime; j <= i; j++) {
				if ((j + time[j] - 1) <= i) {
					for (int k = 1; k <= 4; k++) {
						if (j - k >= 0) {
							max = Math.max(max, pay[j] + dp[j - k]);
						}
					}
				}
			}

			dp[i] = max;

		}

		max = 0;
		for (int i = 1; i <= n; i++) {
			max = Math.max(dp[i], max);
		}

		System.out.println(max);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
