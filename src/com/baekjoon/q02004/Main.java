package com.baekjoon.q02004;

import java.util.Scanner;

public class Main {
	int five = 0;
	int two = 0;

	public int getSqrt(int n, int value) {
		int sqrt = 1;
		while (true) {
			sqrt++;
			n = n * n;
			if (n > value) {
				break;
			}
		}
		return sqrt - 1;
	}

	public int countNum(int k, int n, int sqrt, int count) {
		if (sqrt == 0) {
			return count;
		}

		int a = k;
		int m = (int) Math.pow(n, sqrt);
		while (true) {
			if (a % m == 0) {
				a = a / m;
				count += sqrt;
			} else {
				break;
			}
		}

		return countNum(a, n, sqrt - 1, count);
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = n - m;
		int t, f;
		for (int i = 2; i <= n; i++) {
			if ((i <= m && i > l) || (i > m && i <= l)) {
				f = 0;
				t = 0;
			} else {
				f = countNum(i, 5, getSqrt(5, i), 0);
				t = countNum(i, 2, getSqrt(2, i), 0);

				if (i <= m && i <= l) {
					f *= -1;
					t *= -1;
				}
			}

			five += f;
			two += t;
		}

		System.out.println(Math.min(five, two));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}