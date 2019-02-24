package com.baekjoon.q04963;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int w, h;
		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w == 0 && h == 0) {
				break;
			}

			int map[][] = new int[h + 1][w + 1];
			boolean visited[][] = new boolean[h + 1][w + 1];

			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					map[i][j] = scan.nextInt();
				}
			}

			int count = 0;
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (!visited[i][j] && map[i][j] == 1) {
						dfs(map, visited, i, j, h, w);
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}

	public void dfs(int[][] map, boolean[][] visited, int a, int b, int h, int w) {

		visited[a][b] = true;

		int dx[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
		int dy[] = { -1, -1, -1, 0, 0, 1, 1, 1 };

		int aa, bb;
		for (int i = 0; i < 8; i++) {
			aa = a + dy[i];
			bb = b + dx[i];
			if (aa > 0 && bb > 0 && aa <= h && bb <= w && map[aa][bb] == 1 && !visited[aa][bb]) {
				dfs(map, visited, aa, bb, h, w);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
