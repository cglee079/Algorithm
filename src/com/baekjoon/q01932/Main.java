package com.baekjoon.q01932;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = 0;
		int v[][] = new int[n][n];
		int d[][] = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j ++) {
				v[i][j] = scan.nextInt();
			}
		}
		
		d[0][0] =  v[0][0];
				
		for(int i = 0 ;i < n; i++) {
			for(int j = 0; j <= i; j ++) {
				if(j == 0 && i == 0) {continue;}
				if(j == 0) {
					d[i][j] = d[i-1][j] + v[i][j]; 
				} else if(j == i) {
					d[i][j] = d[i-1][j-1] + v[i][j]; 
				} else {
					d[i][j] = Math.max(d[i-1][j], d[i-1][j-1]) + v[i][j]; 
				}
			}
		}
		

		int max = 0;
		int m = 0;
		for(int j = 0; j < n-1; j ++) {
			m = Math.max(d[n-1][j], d[n-1][j+1]);
			if(max < m) {
				max = m;
			}
		}
		
		System.out.println(max);
				
	}
}
