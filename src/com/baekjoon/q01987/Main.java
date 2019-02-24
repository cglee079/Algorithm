package com.baekjoon.q01987;

import java.util.Scanner;

class Main {
	int R, C;
	int map[][];
	boolean visited[];
	int max;

	public void DFS(int count, int x, int y) {
		int c = map[x][y];

		int a, b;
		int dx[] = { 1, -1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };
		for (int i = 0; i < 4; i++) {
			a = x + dx[i];
			b = y + dy[i];
			if (a > 0 && b > 0 && a <= R && b <= C && !visited[c]) {
				max = Math.max(max, count);
				visited[c] = true;
				DFS(count + 1, a, b);
				visited[c] = false;
			}
		}

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		R = scan.nextInt();
		C = scan.nextInt();
		map = new int[R + 1][C + 1];
		visited = new boolean[26];

		scan.nextLine();

		for (int i = 1; i <= R; i++) {
			char[] cc = scan.nextLine().toCharArray();
			for (int j = 1; j <= C; j++) {
				map[i][j] = cc[j - 1] - 'A';
			}
		}

		DFS(1, 1, 1);

		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
