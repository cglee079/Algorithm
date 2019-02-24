package com.baekjoon.q02748;

import java.util.Scanner;

public class Main {
	private static long f[] = new long[100];
	
	public static long fibo(int n) {
		for(int i = 2; i <= n; i++) {
			f[i]  = f[i-1] + f[i-2];
		}
		
		return f[n];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		f[0] = 0;
		f[1] = 1;
		
		System.out.println(fibo(n));
	}
}
