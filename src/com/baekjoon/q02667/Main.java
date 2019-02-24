package com.baekjoon.q02667;

import java.awt.Point;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	int n;
	int map[][];
	boolean visited[][];
	int count = 0;
	List<Integer> complex = new LinkedList<>();

	public void run() {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		map = new int[n + 2][n + 2];
		visited = new boolean[n + 2][n + 2];

		String str = scan.nextLine();
		for (int i = 1; i <= n; i++) {
			str = scan.nextLine();
			for (int j = 0; j < str.length(); j++) {
				map[i][j + 1] = str.charAt(j) - 48;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (visited[i][j] == false && map[i][j] == 1) {
					complex.add(DFS(i, j));
					count++;
				}
			}
		}

		Collections.sort(complex);

		System.out.println(count);
		for (int i = 0; i < complex.size(); i++) {
			System.out.println(complex.get(i));
		}
	}

	public int DFS(int x, int y) {
		int count = 1;
		visited[x][y] = true;
		
		if (map[x][y - 1] == 1 && visited[x][y - 1] == false) {
			count += DFS(x, y - 1);
		}

		if (map[x - 1][y] == 1 && visited[x - 1][y] == false) {
			count += DFS(x - 1, y);
		}

		if (map[x + 1][y] == 1 && visited[x + 1][y] == false) {
			count += DFS(x + 1, y);
		}

		if (map[x][y + 1] == 1 && visited[x][y + 1] == false) {
			count += DFS(x, y + 1);
		}
		
		System.out.println(x + "-" +  y + "       " + count);
		return count;
	}

	public int BFS(int i, int j) {
		int count = 0;
		Queue<Point> Q = new LinkedList<>();

		Q.add(new Point(i, j));
		visited[i][j] = true;
		count++;

		Point p;
		int x, y;
		while (!Q.isEmpty()) {
			p = Q.poll();

			x = p.x;
			y = p.y;

			if (map[x][y - 1] == 1 && visited[x][y - 1] == false) {
				visited[x][y - 1] = true;
				Q.add(new Point(x, y - 1));
				count++;
			}

			if (map[x - 1][y] == 1 && visited[x - 1][y] == false) {
				visited[x - 1][y] = true;
				Q.add(new Point(x - 1, y));
				count++;
			}

			if (map[x + 1][y] == 1 && visited[x + 1][y] == false) {
				visited[x + 1][y] = true;
				Q.add(new Point(x + 1, y));
				count++;
			}

			if (map[x][y + 1] == 1 && visited[x][y + 1] == false) {
				visited[x][y + 1] = true;
				Q.add(new Point(x, y + 1));
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
