package com.baekjoon.q01352;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Graph {
	int vertex;
	LinkedList<Integer> head[];

	public Graph(int vertex) {
		this.vertex = vertex;
		head = new LinkedList[vertex + 1];

		for (int i = 1; i <= vertex; i++) {
			head[i] = new LinkedList<>();
		}
	}

	public void insertEdge(int a, int b) {
		head[a].add(b);
	}

	public int DFS(int v) {
		boolean visit[] = new boolean[vertex + 1];
		int count = 0;
		Stack<Integer> S = new Stack<>();

		S.push(v);
		visit[v] = true;
		count++;

		LinkedList<Integer> h;
		int child;
		boolean flag;
		while (!S.isEmpty()) {
			v = S.peek();
			h = head[v];
			flag = false;

			for (int i = 0; i < h.size(); i++) {
				child = h.get(i);
				if (visit[child] == false) {
					visit[child] = true;
					S.push(child);
					flag = true;
					count++;
					break;
				}
			}

			if (flag == false) {
				v = S.pop();
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

		int m = scan.nextInt();

		int a, b;
		for (int i = 1; i <= m; i++) {
			a = scan.nextInt();
			b = scan.nextInt();

			G.insertEdge(b, a);
		}

		int d[] = new int[n + 1];
		List<Integer> aa = new LinkedList<>();

		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			d[i] = G.DFS(i);
			if (d[i] > max) {
				max = d[i];
			}
		}

		for (int i = 1; i <= n; i++) {
			if (d[i] == max) {
				aa.add(i);
			}
		}

		Collections.sort(aa);
		for (int i = 0; i < aa.size(); i++) {
			System.out.println(aa.get(i));
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
