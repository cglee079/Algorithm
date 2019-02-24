package com.baekjoon.q02156;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int grape[] = new int[n + 1];
		int drink[][] = new int[n + 1][4];

		for (int i = 1; i <= n; i++) {
			grape[i] = scan.nextInt();
		}

		drink[1][1] = grape[1];

		for (int i = 2; i <= n; i++) {
			drink[i][1] = Math.max(Math.max(drink[i - 2][1], drink[i - 2][2]), drink[i - 2][3]) + grape[i];
			drink[i][2] = drink[i - 1][1] + grape[i];
			drink[i][3] = Math.max(Math.max(drink[i - 1][1], drink[i - 1][2]), drink[i - 1][3]);
		}

		int max = 0;
		max = Math.max(max, drink[n][1]);
		max = Math.max(max, drink[n][2]);
		max = Math.max(max, drink[n][3]);

		System.out.println(max);

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
