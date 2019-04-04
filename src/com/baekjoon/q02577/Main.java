package com.baekjoon.q02577;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int rs = a * b * c;
		
		int[] cnt = new int[10];
		while( rs > 0) {
			cnt[rs % 10]++;
			rs = rs / 10;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
