package com.baekjoon.q02580;

import java.awt.Point;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	int map[][];
	Stack<Point> S;

	public boolean[] find(Point p) {
		boolean arr[] = new boolean[10];

		int x = p.x;
		int y = p.y;

		for (int i = 1; i <= 9; i++) {
			arr[map[x][i]] = true;
			arr[map[i][y]] = true;
		}

		int sx = 0, sy = 0;
		if (x >= 1 && x <= 3) {
			sx = 1;
		} else if (x >= 4 && x <= 6) {
			sx = 4;
		} else if (x >= 7 && x <= 9) {
			sx = 7;
		}
		if (y >= 1 && y <= 3) {
			sy = 1;
		} else if (y >= 4 && y <= 6) {
			sy = 4;
		} else if (y >= 7 && y <= 9) {
			sy = 7;
		}

		for (int i = sx; i < sx + 3; i++) {
			for (int j = sy; j < sy + 3; j++) {
				arr[map[i][j]] = true;
			}
		}

		return arr;
	}

	public int back(Point p) {
		boolean arr[] = find(p);

		for (int i = 0; i < 10; i++) {
			if (arr[i] == false) {
				map[p.x][p.y] = i;
				S.pop();

				if (S.isEmpty()) {
					//copy(map, result);
					print(map);
					return 1;
				} else {
					if(back(S.peek()) ==1) {
						return 1;
					};
				}

				map[p.x][p.y] = 0;
				S.push(p);
			}
		}
		
		return 0;
	}

	public void print(int a[][]) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		map = new int[10][10];
		S = new Stack<>();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				map[i][j] = scan.nextInt();
				if (map[i][j] == 0) {
					S.push(new Point(i, j));
				}
			}
		}

		back(S.peek());
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
