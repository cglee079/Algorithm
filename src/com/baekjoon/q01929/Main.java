package com.baekjoon.q01929;

import java.util.Scanner;

public class Main { //소수 판별법
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();

		boolean bool;
		int k = 0;
		for(int i = s; i <= e; i++) {
			bool = true;
			k = i;
			if(k <= 1) {continue;}
			
			for(int j = 2; j <= Math.sqrt(k); j ++) {
				if(k % j == 0) {
					bool = false;
					break;
				}
			}
			
			if(bool) {
				System.out.println(i);
			}
		}
		
		
	}
}

