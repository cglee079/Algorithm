package com.baekjoon.q02096;

import java.util.Scanner;

public class Main {
	int n;
	int val[][];
	int dpMax[][];
	int dpMin[][];

	public int max(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}

	public int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	public int[] calculate(int x, int y) {
		int[] result = new int[2];

		if (x <= n) {
			if(dpMax[x][y] == -1 || dpMin[x][y] == Integer.MAX_VALUE) {
			int a[] = { -1, Integer.MAX_VALUE };
			int b[] = { -1, Integer.MAX_VALUE };
			int c[] = { -1, Integer.MAX_VALUE };
			switch (y) {
			case 1:
				a = calculate(x + 1, y);
				b = calculate(x + 1, y + 1);
				break;
			case 2:
				a = calculate(x + 1, y - 1);
				b = calculate(x + 1, y );
				c = calculate(x + 1, y + 1);
				break;
			case 3:
				a = calculate(x + 1, y - 1);
				b = calculate(x + 1, y);
				break;
			}

			dpMax[x][y] = max(a[0], b[0], c[0]) + val[x][y];
			dpMin[x][y] = min(a[1], b[1], c[1]) + val[x][y];
			}

			result[0] = dpMax[x][y];
			result[1] = dpMin[x][y];
		}


		return result;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		val = new int[n + 1][4];
		dpMax = new int[n + 1][4];
		dpMin = new int[n + 1][4];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 3; j++) {
				val[i][j] = scan.nextInt();
				dpMax[i][j] = -1;
				dpMin[i][j] = Integer.MAX_VALUE;
			}
		}

		int[] a = calculate(1, 1);
		int[] b = calculate(1, 2);
		int[] c = calculate(1, 3);

		System.out.println(max(a[0], b[0], c[0]) + " " + min(a[1], b[1], c[1]));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
