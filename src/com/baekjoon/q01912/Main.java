package com.baekjoon.q01912;

import java.util.Scanner;

public class Main {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		long max = Integer.MIN_VALUE;
		int n = scan.nextInt();
		int arr[] = new int[n+1];
		long sum[] = new long[n+1];
		
		int k;
		
		k = scan.nextShort();
		arr[1] = k;
		sum[1] = k;
		max = k;
		
		for(int i = 2; i <= n; i++) {
			k = scan.nextShort();
			arr[i] = k;
			sum[i] = sum[i-1] + k;
			
			for(int j = 0;  j < i ; j++) {
				max = Math.max(max, sum[i] - sum[j]);
			}
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
