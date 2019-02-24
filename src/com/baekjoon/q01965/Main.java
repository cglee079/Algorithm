package com.baekjoon.q01965;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int arr[] = new int[n + 1];
		int dp[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = scan.nextInt();
		}


		
		int max = 1;
		for (int i = 1; i <= n; i++) {
			dp[i] = 1;
			
			for (int j = 1; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
