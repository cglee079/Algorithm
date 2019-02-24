package com.baekjoon.q15683;

import java.util.Scanner;

public class Main {
	int n, k;
	int map[][];
	int result = Integer.MAX_VALUE;

	public int[][] drawCCTV(int a, int b, int cs) {
		if (cs == 1) {
			for (int i = a + 1; i <= n; i++) {
				if (map[i][b] == 6) {
					break;
				}
				if (map[i][b] == 0) {
					map[i][b] = 9;
				}
			}
		}

		if (cs == 2) {
			for (int i = b + 1; i <= k; i++) {
				if (map[a][i] == 6) {
					break;
				}
				if (map[a][i] == 0) {
					map[a][i] = 9;
				}
			}
		}

		if (cs == 3) {
			for (int i = a - 1; i >= 1; i--) {
				if (map[i][b] == 6) {
					break;
				}
				if (map[i][b] == 0) {
					map[i][b] = 9;
				}
			}
		}

		if (cs == 4) {
			for (int i = b - 1; i >= 1; i--) {
				if (map[a][i] == 6) {
					break;
				}
				if (map[a][i] == 0) {
					map[a][i] = 9;
				}
			}
		}

		return map;
	}

	public int[][] clone(int a[][]) {
		int[][] b = new int[n + 1][k + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				b[i][j] = a[i][j];
			}
		}

		return b;
	}

	public void draw(int a, int b) {
		
		int value;
		int temp[][];
		while (!(a == n && b == k)) {
			a++;
			if (a > n) {
				a = 1;
				b++;
			}
			value = map[a][b];
			if (value == 0 || value == 9 || value == 6) {
			} else if (value == 1) {
				temp = clone(map);
				drawCCTV(a, b, 1);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 2);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 3);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 4);
				draw(a, b);
				map = clone(temp);
				break;
			} else if (value == 2) {
				temp = clone(map);

				drawCCTV(a, b, 1);
				drawCCTV(a, b, 3);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 2);
				drawCCTV(a, b, 4);
				draw(a, b);
				map = clone(temp);
				break;
			} else if (value == 3) {
				temp = clone(map);

				drawCCTV(a, b, 1);
				drawCCTV(a, b, 2);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 2);
				drawCCTV(a, b, 3);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 3);
				drawCCTV(a, b, 4);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 4);
				drawCCTV(a, b, 1);
				draw(a, b);
				map = clone(temp);
				break;
			} else if (value == 4) {
				temp = clone(map);

				drawCCTV(a, b, 1);
				drawCCTV(a, b, 2);
				drawCCTV(a, b, 3);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 2);
				drawCCTV(a, b, 3);
				drawCCTV(a, b, 4);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 3);
				drawCCTV(a, b, 4);
				drawCCTV(a, b, 1);
				draw(a, b);
				map = clone(temp);

				drawCCTV(a, b, 4);
				drawCCTV(a, b, 1);
				drawCCTV(a, b, 2);
				draw(a, b);
				map = clone(temp);

				break;
			} else if (value == 5) {
				temp = clone(map);
				drawCCTV(a, b, 1);
				drawCCTV(a, b, 2);
				drawCCTV(a, b, 3);
				drawCCTV(a, b, 4);
				draw(a, b);
				map = clone(temp);
				break;
			}
		}
		

		if (a == n && b == k) {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= k; j++) {
					if (map[i][j] == 0) {
						count++;
					}
				}
			}

			result = Math.min(count, result);
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		k = scan.nextInt();
		map = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				map[i][j] = scan.nextInt();
			}
		}

		draw(0, 1);

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}