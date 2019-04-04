package com.baekjoon.q05597;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = 28;
		boolean[] submit = new boolean[31];
		
		int k;
		for(int i = 0; i < n; i++) {
			k = scan.nextInt();
			submit[k] = true;
		}
		
		for(int i = 1; i <= 30; i++) {
			if(!submit[i]) {
				System.out.println(i);
			}
		}
	}	

	public static void main(String[] args) {
		new Main().run();
	}

}
