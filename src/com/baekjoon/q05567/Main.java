package com.baekjoon.q05567;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	LinkedList<Integer> head[];
	boolean visited[];
	int level[];
	int n;

	public void run() {
		Scanner scan = new Scanner(System.in);

		// √ ±‚»≠
		n = scan.nextInt();
		head = new LinkedList[n + 1];
		for (int i = 1; i <= n; i++) {
			head[i] = new LinkedList<>();
		}
		visited = new boolean[n + 1];
		level = new int[n + 1];

		int a, b;
		int k = scan.nextInt();
		for (int i = 0; i < k; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			head[a].add(b);
			head[b].add(a);
		}
		////////

		// BFS
		Queue<Integer> Q = new LinkedList<>();

		Q.add(1);
		visited[1] = true;
		level[1] = 0;

		int count = 0;
		int v, child;
		LinkedList<Integer> h;
		while (!Q.isEmpty()) {
			v = Q.poll();
			h = head[v];
			
			for (int i = 0; i < h.size(); i++) {
				child = h.get(i);
				if (visited[child] == false) {
					visited[child] = true;
					Q.add(child);

					level[child] = level[v] + 1;
					if (level[child] <= 2) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}