package com.baekjoon.q02749;

import java.util.Scanner;

public class Main {
	public static long fibo(int in) {
		int p = 15 * 100000;
		long fibo[] = new long[p];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i =2; i < p; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
	        fibo[i] %= 1000000;
	        System.out.println(fibo[i]);
		}
		
		return fibo[in % p];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		
		System.out.println(fibo(in));
	}
} 
