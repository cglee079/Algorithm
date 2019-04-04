package com.baekjoon.q10026;

import java.util.Scanner;

public class Main {
	char[][] map;
	boolean[][] visit;
	int r;

	public void dfs(int i, int j, char c) {
		if (i < 0 || i >= r || j < 0 || j >= r) {
			return;
		}

		if(visit[i][j]) {
			return;
		}
		
		if (map[i][j] != c) {
			return;
		}

		visit[i][j] = true;

		dfs(i, j + 1, c);
		dfs(i, j - 1, c);
		dfs(i + 1, j, c);
		dfs(i - 1, j, c);
	}

	public int search() {
		visit = new boolean[r][r];
		int count = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (!visit[i][j]) {
					dfs(i, j, map[i][j]);
					count++;
				}
			}
		}
		return count;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		r = scan.nextInt();
		map = new char[r][r];

		String str;
		for (int i = 0; i < r; i++) {
			str = scan.next();
			map[i] = str.toCharArray();
		}

		int cntA = search();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if(map[i][j] == 'G') {
					map[i][j] = 'R';
				}
			}
		}
		
		int cntB = search();
		
		System.out.print(cntA + " " + cntB);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
