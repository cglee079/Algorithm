package com.baekjoon.q09251;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		String aa = scan.nextLine();
		String bb = scan.nextLine();

		char[] a = aa.toCharArray();
		char[] b = bb.toCharArray();
		int dp[][] = new int[aa.length() + 1][bb.length() + 1];

		int max = 0;
		for (int i = 0; i < aa.length(); i++) {
			for (int j = 0; j < bb.length(); j++) {
				if (a[i] == b[j]) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}

				max = Math.max(max, dp[i + 1][j + 1]);
			}
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
