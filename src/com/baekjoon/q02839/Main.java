package com.baekjoon.q02839;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 0;

		if (n % 5 == 0) {
			System.out.println(n / 5);
			return;
		}
		
		int c = n;
		while (c >= 0) {
			c = c - 3;
			count++;
			if (c % 5 == 0) {
				break;
			}
		}

		if (c < -1) {
			System.out.println(-1);
		} else if (c == 0) {
			System.out.println(count);
		} else {
			System.out.println(count + c / 5);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
