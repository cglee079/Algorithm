package com.baekjoon.q02638;

import java.awt.Point;
import java.util.Scanner;

public class Main {
	int N;
	int M;
	int map[][];
	boolean check[][];

	int dx[] = { 1, 0, 0, -1 };
	int dy[] = { 0, 1, -1, 0 };

	public void dfs(int i, int j) {
		check[i][j] = true;

		int x, y;
		for (int t = 0; t < 4; t++) {
			x = i + dx[t];
			y = j + dy[t];

			if (x > 0 && x <= N + 1 && y > 0 && y <= M + 1 && check[x][y] == false && map[x][y] == 0) {
				dfs(x, y);
			}
		}

	}

	public Point getValid() {
		int i, j;
		for (i = 1; i <= N; i++) {
			for (j = 1; j <= M; j++) {
				if (map[i][j] == 0 && check[i][j] == false) {
					return new Point(i, j);
				}
			}
		}

		return null;
	}

	public void loop(int time) {
		check = new boolean[N + 2][M + 2];

		Point p = getValid();
		if (p == null) {
			return;
		}
		dfs(p.x, p.y);

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (map[i][j] == 1) {
					int x;
					int y;
					int c = 0;
					for (int t = 0; t < 4; t++) {
						x = i + dx[t];
						y = j + dy[t];

						if (x > 0 && x <= N + 1 && y > 0 && y <= M + 1 && check[x][y] && map[x][y] == 0) {
							c++;
						}
					}

					if (c >= 2) {
						map[i][j] = 0;
					}
				}
			}
		}

		int count = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if(map[i][j] != 0) {
					count++;
				}
			}
		}

		if(count == 0) {
			System.out.println(time);
		} else {
			loop(time + 1);
		}

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		map = new int[N + 2][M + 2];
		check = new boolean[N + 2][M + 2];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				map[i][j] = scan.nextInt();
			}
		}

		loop(1);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
