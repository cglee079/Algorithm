package com.baekjoon.q11006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int a;
		int b;
		int u, t;
		for (int i = 0; i < n; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			u = (2 * b) - a;
			t = b - u;
			System.out.println(u + " " + t);
		}
	}
}
