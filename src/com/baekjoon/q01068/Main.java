package com.baekjoon.q01068;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Graph {
	int n;
	private List<Integer> head[];

	public Graph(int n) {
		this.n = n;
		head = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			head[i] = new LinkedList<>();
		}
	}

	public void insertEdge(int a, int b) {
		if (b == -1) {
			return;
		}

		head[b].add(a);
	}

	public void removeNode(int v) {
		boolean visited[] = new boolean[n];
		Queue<Integer> Q = new LinkedList<>();

		Q.add(v);
		visited[v] = true;
		List<Integer> h;

		int child;
		while (!Q.isEmpty()) {
			v = Q.poll();
			h = head[v];

			for (int j = 0; j < h.size(); j++) {
				child = h.get(j);
				if (visited[child] == false) {
					Q.add(child);
					visited[child] = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				head[i] = null;
			}
		}
	}

	public int findRifNode(int removed) {
		int count = 0;

		List<Integer> h;
		int child;
		for (int i = 0; i < head.length; i++) {
			h = head[i];
			if (h != null) {
				child = 0;

				for (int j = 0; j < h.size(); j++) {
					if (h.get(j) != removed) {
						child++;
					}
				}

				if (child == 0) {
					count++;
				}
			}
		}

		return count;
	}
}

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Graph G = new Graph(n);

		for (int i = 0; i < n; i++) {
			G.insertEdge(i, scan.nextInt());
		}

		int v = scan.nextInt();
		G.removeNode(v);
		System.out.println(G.findRifNode(v));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
