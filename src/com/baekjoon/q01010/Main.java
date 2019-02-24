package com.baekjoon.q01010;

import java.util.Scanner;

public class Main {
	public long calculate(int n, int m) {
		if( n == m ) {
			return 1;
		}
		
		long dp[][] = new long[n][m];
		
		for(int i =0; i < m ; i++) {
			dp[0][i] = 1;
		}
		
		for(int i = 1; i < n; i ++ ) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < j;k ++) {
					dp[i][j] += dp[i-1][k];
				}
			}
		}
		
		long result  = 0;
		for(int i = 0; i < m; i++) {
			result += dp[n-1][i];
		}
		
		return result;
	}
	public void run() {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		int n, m;
		for(int i =0; i < t; i++) {
			n = scan.nextInt();
			m = scan.nextInt();
			
			System.out.println(calculate(n, m));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
