package com.baekjoon.q05533;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int[][] count = new int[3][101];
		int n = scan.nextInt();
		int[][] ps = new int[n][3];
		for (int i = 0; i < n; i++) {
			ps[i][0] = scan.nextInt();
			ps[i][1] = scan.nextInt();
			ps[i][2] = scan.nextInt();

			count[0][ps[i][0]]++;
			count[1][ps[i][1]]++;
			count[2][ps[i][2]]++;
		}

		int rs;
		for (int i = 0; i < n; i++) {
			rs = 0;
			for (int j = 0; j < 3; j++) {
				if (count[j][ps[i][j]] == 1) {
					rs += ps[i][j];
				}
			}
			System.out.println(rs);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
