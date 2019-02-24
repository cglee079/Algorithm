package com.baekjoon.q15686;

import java.awt.Point;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	int N;
	int M;
	int map[][];
	int dp[][];
	int result = Integer.MAX_VALUE;
	List<Point> homes = new LinkedList<>();
	List<Point> chikens = new LinkedList<>();

	public boolean[] clone(boolean[] valid) {
		boolean b[] = new boolean[valid.length];
		for (int i = 0; i < valid.length; i++) {
			b[i] = valid[i];
		}

		return b;
	}

	public void rand(int index, boolean[] valid, int count) {
		if (index == valid.length) {
			if (count == M) {
				int sum = 0;
				int min;
				Point h;
				Point c;
				for (int i = 0; i < homes.size(); i++) {
					h = homes.get(i);
					min = Integer.MAX_VALUE;
					for (int j = 0; j < chikens.size(); j++) {
						if (valid[j] == true) {
							c = chikens.get(j);
							min = Math.min(min, Math.abs(h.x - c.x) + Math.abs(h.y - c.y));
						}
					}

					sum = sum + min;
				}

				result = Math.min(result, sum);
			}
			return;
		}

		if (count == M) {
			rand(index + 1, clone(valid), count);
		}
		if (count < M) {
			boolean[] newValid = clone(valid);
			newValid[index] = true;

			rand(index + 1, newValid, count + 1);
			rand(index + 1, clone(valid), count);
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		map = new int[N + 1][N + 1];
		dp = new int[N + 1][N + 1];

		int k;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				k = scan.nextInt();
				map[i][j] = k;

				if (k == 1) {
					homes.add(new Point(i, j));
				}

				if (k == 2) {
					chikens.add(new Point(i, j));
				}
			}
		}

		boolean a[] = new boolean[chikens.size()];

		rand(0, a, 0);

		System.out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
