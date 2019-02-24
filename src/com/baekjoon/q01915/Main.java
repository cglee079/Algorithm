package com.baekjoon.q01915;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int result = 0;

		int map[][] = new int[n + 1][m + 1];
		int dp[][] = new int[n + 1][m + 1];

		scan.nextLine();
		for (int x = 1; x <= n; x++) {
			String str = scan.nextLine();
			char[] cc = str.toCharArray();
			for (int y = 1; y <= m; y++) {
				map[x][y] = cc[y - 1] - '0';

				if (map[x][y] == 1) {
					int maxLen = (int) Math.sqrt(dp[x - 1][y - 1]);
					if (dp[x - 1][y - 1] == 0) {
						maxLen = 0;
					}

					int len = 1;
					for (int i = 0; i <= maxLen; i++) {
						if (map[x - i][y] == 1 && map[x][y - i] == 1) {
							len = i + 1;
						} else {
							break;
						}
					}

					dp[x][y] = len * len;

					result = Math.max(result, dp[x][y]);
				}

			}
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
