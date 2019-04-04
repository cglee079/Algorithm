package com.baekjoon.q05218;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String str;
		char[] a;
		char[] b;
		int ak;
		int bk;

		for (int i = 0; i < n; i++) {
			str = scan.next();
			a = str.toCharArray();

			str = scan.next();
			b = str.toCharArray();

			System.out.print("Distances: ");
			for (int j = 0; j < a.length; j++) {
				ak = a[j] - 'A' + 1;
				bk = b[j] - 'A' + 1;

				if (ak <= bk) {
					System.out.print((bk - ak) + " ");
				} else {
					System.out.print(((bk + 26) - ak) + " ");
				}
			}

			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
