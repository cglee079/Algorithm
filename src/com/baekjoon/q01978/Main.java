package com.baekjoon.q01978;

import java.util.Scanner;

public class Main { //소수 판별법
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int is[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			is[i] = sc.nextInt();
		}

		int count = 0;
		boolean bool;
		int k = 0;
		for(int i = 0; i < n; i++) {
			bool = true;
			k = is[i];
			if(k <= 1) {continue;}
			
			for(int j = 2; j < k; j ++) {
				if(k % j == 0) {
					bool = false;
					break;
				}
			}
			
			if(bool) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
