package com.baekjoon.q09663;

import java.util.Scanner;

public class Main {
	short map[][];
	int n;
	int result = 0;

	public void re(int x, int y, int d) {
		for (int j = 1; j <= n; j++) {
			map[x][j] += d;
			map[j][y] += d;
		}

		int i, j;
		i = x;
		j = y;
		while (i > 0 && j > 0 && i <= n && j <= n) {
			map[i][j] += d;
			i--;
			j--;
		}

		i = x;
		j = y;
		while (i > 0 && j > 0 && i <= n && j <= n) {
			map[i][j] += d;
			i--;
			j++;
		}

		i = x;
		j = y;
		while (i > 0 && j > 0 && i <= n && j <= n) {
			map[i][j] += d;
			i++;
			j++;
		}

		i = x;
		j = y;
		while (i > 0 && j > 0 && i <= n && j <= n) {
			map[i][j] += d;
			i++;
			j--;
		}

		map[x][y] += d * 5;
	}

	public void back(int x, int y, int count) {
		if (count == n) {
			result += 1;
			return;
		}

		re(x, y, 1);

		int xx = x + 1;
		if (xx <= n) {
			for (int i = 1; i <= n; i++) {
				if (map[xx][i] == 0) {
					back(xx, i, count + 1);
				}
			}
		}

		re(x, y, -1);
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		map = new short[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			back(1, i, 1);
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
