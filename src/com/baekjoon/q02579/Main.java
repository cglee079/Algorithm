package com.baekjoon.q02579;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int stair[] = new int[n+1];
		int dp[][] = new int[n+1][3];
		for(int i = 1; i <= n; i++) {
			stair[i] = scan.nextInt();
		}
		
		dp[1][1] = stair[1];
		
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j <= 2; j++) {
				if(i >= j) {
					if(j == 1) {
						int max = Math.max(dp[i-2][1], dp[i-2][2]);
						
						dp[i][j] = max  + stair[i];
					} else {
						dp[i][j] = dp[i-1][j-1] + stair[i];
					}
				}
			}
		}
		
		System.out.println(Math.max(dp[n][1], dp[n][2]));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
