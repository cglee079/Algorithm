package com.baekjoon.q02178;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	int map[][];
	int w, h;

	public int BFS() {
		int d[][] = new int[h + 1][w + 1];

		for (int i = 0; i < h + 1; i++) {
			for (int j = 0; j < w + 1; j++) {
				d[i][j] = -1;
			}
		}

		int x, y;
		x = 1;
		y = 1;
		d[1][1] = 0;

		int xs[] = { 1, -1, 0, 0 };
		int ys[] = { 0, 0, 1, -1 };

		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));

		Point p;
		while (!q.isEmpty()) {
			p = q.poll();
			x = p.x;
			y = p.y;

			for (int i = 0; i < 4; i++) {
				if (map[x + xs[i]][y + ys[i]] == 1) {
					map[x + xs[i]][y + ys[i]] = 2;
					d[x + xs[i]][y + ys[i]] = d[x][y] + 1;
					
					q.add(new Point(x + xs[i], y + ys[i]));
				}
			}
		}

		return d[h][w] + 1 ;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		h = scan.nextInt();
		w = scan.nextInt();

		map = new int[h + 2][w + 2];

		String str = scan.nextLine();
		for (int i = 0; i < h; i++) {
			str = scan.nextLine();
			for (int j = 0; j < w; j++) {
				map[i + 1][j + 1] = str.charAt(j) - '0';
			}
		}

		System.out.println(BFS());

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
