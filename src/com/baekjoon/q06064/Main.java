package com.baekjoon.q06064;

import java.util.Scanner;

public class Main {
	public int getGcd(int x, int y) {// 최대 공약수
		int r = -1;
		int a, b;
		if (x > y) {
			a = x;
			b = y;
		} else {
			a = y;
			b = x;
		}

		while (r != 0) {
			r = a % b;
			if (r == 0) {
				break;
			}
			a = b;
			b = r;

		}

		return b;
	}

	public int getLcm(int x, int y) { // 최소공배수
		return (x * y) / getGcd(x, y);
	}

	public int algo(int M, int N, int x, int y, int lcm) {
		int a = x;
		int b = y;

		while (a <= lcm) {
			while (b <= lcm) {
				if (a == b) {
					return a;
				}

				if (b > a) {
					break;
				}
				b = b + N;
			}
			b = y;
			a = a + M;
		}

		return -1;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i = i++) {
			int M = scan.nextInt();
			int N = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int lcm = getLcm(M, N);

			int result = algo(M, N, x, y, lcm);
			System.out.println(result);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
