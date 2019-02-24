package com.baekjoon.q01005;

import java.util.LinkedList;
import java.util.Scanner;

class Graph {
	int vertex;
	LinkedList<Integer> head[];
	int value[];
	int dp[];
	boolean visited[];
	public Graph(int vertex) {
		this.vertex = vertex;
		head = new LinkedList[vertex + 1];
		value = new int[vertex + 1];
		dp = new int[vertex + 1];
		visited = new boolean[vertex + 1];

		for (int i = 1; i <= vertex; i++) {
			head[i] = new LinkedList<>();
			dp[i] = -1;
		}
	}

	public void setValue(int index, int val) {
		this.value[index] = val;
	}

	public void insertEdge(int x, int y) {
		head[y].add(x);
	}

	public int BFS(int v) {
		if (dp[v] == -1) {
			LinkedList<Integer> h = head[v];
			dp[v] = value[v];
			int child;
			for (int i = 0; i < h.size(); i++) {
				child = h.get(i);
				if (visited[child] == false) {
					visited[v] = true;
					dp[v] = Math.max(BFS(child) + value[v], dp[v]);
					visited[v] = false;
				}
			}
		}
		
		return dp[v];
	}

}

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int k = scan.nextInt();

			Graph G = new Graph(n);

			for (int j = 1; j <= n; j++) {
				G.setValue(j, scan.nextInt());
			}

			for (int j = 1; j <= k; j++) {
				G.insertEdge(scan.nextInt(), scan.nextInt());
			}

			int find = scan.nextInt();
			G.BFS(find);
			
			System.out.println(G.dp[find]);

		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
