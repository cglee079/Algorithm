package com.baekjoon.q01652;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		boolean map[][] = new boolean[N + 2][N + 2];
		scan.nextLine();
		
		String str;
		char cc[];
		for (int i = 1; i <= N; i++) {
			str = scan.nextLine();
			cc = str.toCharArray();
			for (int j = 1; j <= N; j++) {
				if (cc[j - 1] == '.') {
					map[i][j] = true;
				}
			}
		}

		int garo = 0;
		int sero = 0;
		int count = 0;
		boolean valid = false;
		for (int i = 1; i <= N + 1; i++) { // Check 가로
			valid = false;
			count = 0;
			for (int j = 1; j <= N + 1; j++) {
				if (map[i][j]) {
					count++;
					if (count >= 2) {
						valid = true;
					}
				} else {
					if (valid) {
						garo++;
					}
					valid = false;
					count = 0;
				}
			}
		}

		for (int i = 1; i <= N + 1; i++) { // Check 세로
			valid = false;
			count = 0;
			for (int j = 1; j <= N + 1; j++) {
				if (map[j][i]) {
					count++;
					if (count >= 2) {
						valid = true;
					}
				} else {
					if (valid) {
						sero++;
					}
					valid = false;
					count = 0;
				}
			}
		}

		
		
		System.out.println(garo + " " + sero);
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
}
