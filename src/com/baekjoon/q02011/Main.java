package com.baekjoon.q02011;

import java.util.Scanner;

public class Main {
	public int toInt(char a, char b) {
		if (a == '0') {
			return Integer.MAX_VALUE;
		}
		StringBuilder temp = new StringBuilder();
		temp.append(a);
		temp.append(b);

		return Integer.parseInt(temp.toString());
	}

	public void run() {

		Scanner scan = new Scanner(System.in);

		String code = scan.nextLine();
		char cc[] = code.toCharArray();
		int n = code.length();
		int dp[] = new int[n + 1];
		int m = 1000000;
		if (cc[0] != '0') {
			dp[0] = 1;
			dp[1] = 1;
		}

		int k;
		for (int i = 2; i <= n; i++) {
			k = i - 1;
			if (cc[k] == '0') {
				if (toInt(cc[k - 1], cc[k]) <= 26) {
					dp[i] += dp[i - 2] % m;
				} else {
					break;
				}
			} else if (cc[k - 1] == '0') {
				dp[i] = dp[i - 1] % m;
			} else {
				dp[i] += dp[i - 1] % m;
				if (toInt(cc[k - 1], cc[k]) <= 26) {
					dp[i] += dp[i - 2] % m;
				}
			}
		}

		System.out.println(dp[n] % m);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
