package com.baekjoon.q11066;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for(int k= 0; k < t; k++) {
			
			int n;
			int dp[][];
			int novel[];
			int sum[];
			
			n = scan.nextInt();
			novel = new int[n+1];
			dp = new int[n+1][n+1];
			sum = new int[n+1];
			for(int j = 1; j <= n; j++) {
				novel[j] = scan.nextInt();
				sum[j] = sum[j-1] + novel[j];
			}
			
			int d = 1;
			int x, y;
			for(d = 1; d < n; d++) {
				for(x = 1; x + d <= n; x++) {
					y = x + d;
					dp[x][y] = Integer.MAX_VALUE;
					
					for(int m=x; m < y; m++) {
//						System.out.println("( " + x + ", " + y +" ) =" + dp[x][y]);
						dp[x][y] = Math.min(dp[x][y], dp[x][m] + dp[m+1][y] + sum[y] - sum[x-1]);
					}
				}
			}
			
			System.out.println(dp[1][n]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
