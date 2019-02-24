package com.baekjoon.q01671;

import java.util.LinkedList;
import java.util.Scanner;

class Graph {
	int n;
	LinkedList<Integer> head[];
	int count[];

	public Graph(int n) {
		this.n = n;
		head = new LinkedList[n + 1];
		count = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			head[i] = new LinkedList<>();
			count[i] = -1;
		}

	}

	public void insertEdge(int p, int c) {
		head[p].add(c);
	}

	public int countChild(int v) {
		if(count[v] == -1) {
			LinkedList<Integer> h = head[v];
			
			count[v] = 0;
			for(int i = 0; i < h.size(); i++) {
				count[v] += countChild(count[h.get(i)]);
			}
			
		}
		
		return count[v];
	}

}

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int size[] = new int[n + 1];
		int speed[] = new int[n + 1];
		int inteli[] = new int[n + 1];
		Graph G = new Graph(n);

		for (int i = 1; i <= n; i++) {
			size[i] = scan.nextInt();
			speed[i] = scan.nextInt();
			inteli[i] = scan.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i != j && size[i] < size[j] && speed[i] < speed[j] && inteli[i] <= inteli[j]) {
					G.insertEdge(i, j);
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			G.countChild(i);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
