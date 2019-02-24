package com.baekjoon.q01037;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int max = scan.nextInt();
		int min = max;
		int c = 0;
		for (int i = 0; i < N - 1; i++) {
			c = scan.nextInt();
			max = Math.max(max, c);
			min = Math.min(min, c);
		}

		System.out.println(max * min);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
