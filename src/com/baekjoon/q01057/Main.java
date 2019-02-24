package com.baekjoon.q01057;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		if (B < A) {
			int temp = B;
			B = A;
			A = temp;
		}

		int round = 0;
		while (N != 1) {
			round++;

			if (A + 1 == B && A % 2 == 1) {
				break;
			}

			N = N / 2 + N % 2;
			A = A / 2 + A % 2;
			B = B / 2 + B % 2;

		}

		System.out.println(round);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
