package com.baekjoon.q01697;

import java.util.Scanner;

public class Main {
	int n;
	int[] arr;
	int rdp[];
	int ldp[];

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		arr = new int[n + 1];
		rdp = new int[n + 1];
		ldp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			rdp[i] = 1;

			for (int j = 1; j < i; j++) {
				if (arr[i] > arr[j]) {
					rdp[i] = Math.max(rdp[j] + 1, rdp[i]);
				}
			}
		}

		for (int i = n; i >= 1; i--) {
			ldp[i] = 1;

			for (int j = n; j > i; j--) {
				if (arr[i] > arr[j]) {
					ldp[i] = Math.max(ldp[j] + 1, ldp[i]);
				}
			}
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = Math.max(rdp[i] + ldp[i] - 1, max);
		}
		
		System.out.println(max);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
