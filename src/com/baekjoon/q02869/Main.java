package com.baekjoon.q02869;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();

		int up = A - B;
		int C = V - A;
		int day = 0;

		int t = C / up;

		if (C % up != 0) {
			day = t + 1;
		} else {
			day = t;
		}

		System.out.println(day + 1);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
