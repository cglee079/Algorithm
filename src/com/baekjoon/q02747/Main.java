package com.baekjoon.q02747;

import java.util.Scanner;

public class Main {
	public static int saved[] = new int[50];
	
	public static int fibo(int n) {
		if(n == 0) { return 0; }
		else if(n == 1) { return 1; }
		
		if(saved[n] != 0) {
			return saved[n];
		} else {
			saved[n] =  fibo(n-1)  + fibo(n-2);
			return saved[n];
		}
	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		System.out.println(fibo(input));
		
	}
}
