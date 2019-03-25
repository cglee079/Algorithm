package com.study.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphSearch {
	int n;
	List<Integer>[] edges;
	boolean visited[];
	int dist[];

	public GraphSearch(int n) {
		this.n = n;
		this.dist = new int[n];
		visited = new boolean[n];
		edges = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			dist[i] = -1;
			edges[i] = new ArrayList<>();
		}
	}

	public void insertEdges(int a, int b) {
		edges[a].add(b);
	}

	public boolean bfs(int s, int tg) {
		Queue<Integer> q = new LinkedList<>();

		q.add(s);

		dist[s] = 0;
		int v;
		int k;
		List<Integer> edge;

		boolean result = false;
		while (!q.isEmpty()) {
			v = q.poll();
			visited[v] = true;
			edge = edges[v];

			if (v == tg) {
				result = true;
			}

			for (int i = 0; i < edge.size(); i++) {
				k = edge.get(i);
				if (!visited[k]) {
					dist[k] = dist[v] + 1;
					q.add(k);
				}
			}

		}

		return result;

	}

	public boolean dfs(int s, int tg) {
		Stack<Integer> stack = new Stack<>();

		stack.add(s);

		int v;
		int k;
		List<Integer> edge;

		while (!stack.isEmpty()) {
			v = stack.pop();
			visited[v] = true;
			edge = edges[v];

			if (v == tg) {
				return true;
			}

			for (int i = 0; i < edge.size(); i++) {
				k = edge.get(i);
				if (visited[k] == false) {
					stack.push(k);
				}
			}

		}

		return false;

	}

	public static void main(String[] args) {
		int n = 10;
		GraphSearch gs = new GraphSearch(n);
		gs.insertEdges(0, 7);
		gs.insertEdges(2, 3);
		gs.insertEdges(7, 2);

		// System.out.println(g.bfs(3, 7));
		System.out.println(gs.bfs(0, 3));
		System.out.print(Arrays.toString(gs.dist));
	}
}
