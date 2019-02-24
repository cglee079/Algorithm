package com.baekjoon.q01759;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int l;
	int c;
	char ar[];

	public void backTraking(String str, int level, int z, int m, int index) {
		if (level == l && str.length() == l && z >= 2 && m >= 1) {
			System.out.println(str);
		}

		int zz, mm;
		for (int i = index; i < ar.length; i++) {
			zz = z;
			mm = m;
			switch (ar[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				mm += 1;
				break;
			default:
				zz += 1;
				break;
			}
			backTraking(str + ar[i], level + 1, zz, mm, i + 1);
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		l = sc.nextInt();
		c = sc.nextInt();
		ar = new char[c];

		for (int i = 0; i < c; i++) {
			ar[i] = sc.next().charAt(0);
		}

		Arrays.sort(ar);

		backTraking("", 0, 0, 0, 0);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
