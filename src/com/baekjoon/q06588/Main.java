package com.baekjoon.q06588;

import java.util.Scanner;

public class Main {
	boolean dp[];

	public boolean isSosoo(int k) {

		boolean sosoo = true;
		for (int i = 2; i <= Math.sqrt(k); i++) {
			if (k % i == 0) {
				sosoo = false;
				break;
			}
		}

		dp[k] = sosoo;

		return sosoo;

	}

	public void goldbah(int n) {
		int end = n / 2;

		boolean t = false;
		int a, b;
		for (int i = 2; i <= end; i++) {
			a = i;
			b = n - a;
			if (isSosoo(a) && isSosoo(b)) {
				System.out.println(n + " = " + a + " + " + b);
				t = true;
				break;
			}
		}

		if (!t) {
			System.out.println("Goldbach's conjecture is wrong.");
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		dp = new boolean[1000000];

		while (true) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}

			goldbah(n);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
