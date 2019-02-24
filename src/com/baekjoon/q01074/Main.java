package com.baekjoon.q01074;

import java.util.Scanner;

public class Main {
	public void find(int s, int r, int c, int once) {
		if (once == 1) {
			if (r == 1 && c == 1) {
			} else if (r == 1 && c == 2) {
				s++;
			} else if (r == 2 && c == 1) {
				s += 2;
			} else if (r == 2 && c == 2) {
				s += 3;
			}

			System.out.println(s - 1);

			return;
		}

		if (r <= once && c <= once) {
			find(s, r, c, once / 2);
		} else if (r <= once && c <= once * 2 && c > once) {
			find(s + (int) Math.pow(once, 2), r, c - once, once / 2);
		} else if (r <= once * 2 && r > once && c <= once) {
			find(s + (int) Math.pow(once, 2) * 2, r - once, c, once / 2);
		} else if (r <= once * 2 && r > once && c <= once * 2 && c > once) {
			find(s + (int) Math.pow(once, 2) * 3, r - once, c - once, once / 2);
		}

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int r = scan.nextInt();
		int c = scan.nextInt();

		r = r + 1;
		c = c + 1;

		int k = 2;
		int a =1;
		for (int i = 0; i < N; i++) {
			k *= k;
			a = a *2;
		}
		
		find(1, r, c, a/2);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
