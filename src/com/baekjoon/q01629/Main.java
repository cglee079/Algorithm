package com.baekjoon.q01629;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		double A = scan.nextInt();
		double B = scan.nextInt();
		double C = scan.nextInt();

		double k = 1;
		for (int i = 1; i <= B; i++) {
			k = k * A;
			System.out.println(k + "  # " + (long)k % C);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
