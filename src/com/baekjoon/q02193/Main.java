package com.baekjoon.q02193;

import java.util.Scanner;

public class Main {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long dp[][] = new long[n + 1][2];
		
		dp[1][1]  = 1;
		dp[1][0]  = 0;
		
		for(int i = 2; i <= n; i++) {
			dp[i][1] = dp[i-1][0];
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
		}
		
		System.out.println(dp[n][0] + dp[n][1]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
