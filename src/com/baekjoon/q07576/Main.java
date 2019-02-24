package com.baekjoon.q07576;

import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public int tomato[][];
	public int grow[][];

	public void CalcuateGrow(int n, int m) {
		int dx[] = { 1, -1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		Queue<Point> Q = new LinkedList<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (tomato[i][j] == 1) {
					Q.add(new Point(i, j));
					grow[i][j] = 1;
				}
			}
		}

		int x, y, max = 1;
		Point p;
		while (!Q.isEmpty()) {
			p = Q.poll();
			x = p.x;
			y = p.y;

			if (tomato[x][y] == 1) {
				for (int k = 0; k < 4; k++) {
					int a = x + dx[k];
					int b = y + dy[k];
					if (a >= 0 && b >= 0 && a < m && b < n && tomato[a][b] == 0)  {
						tomato[a][b] = 1;
						grow[a][b] = grow[x][y] + 1;
						max = grow[a][b];
						Q.add(new Point(a, b));
					}
				}
			}
			
		}
		
		for(int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(grow[i][j] == 0) {
					System.out.println(-1);
					return;
				};
			}
		}
		
		System.out.println(max -1);
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		tomato = new int[m][n];
		grow = new int[m][n];

		int k;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				k = scan.nextInt();
				tomato[i][j] = k;
				if (k == -1) {
					grow[i][j] = -1;
				}
			}
		}

		CalcuateGrow(n, m);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
