package com.baekjoon.q02606;

import java.util.Scanner;
import java.util.Stack;

class GraphNode {
	int vertex;
	GraphNode link;
}

class Graph{
	int vertex;
	GraphNode head[];
	
	public Graph(int vertex) {
		this.vertex = 100;
		head = new GraphNode[100 + 1];
	}

	public void insertEdge(int v1, int v2) {
		GraphNode nd = new GraphNode();
		nd.vertex = v2;
		nd.link = head[v1];
		head[v1] = nd;
	}
	
	public int DFS(int v) {
		boolean visited[] = new boolean[100 + 1];
		Stack<Integer> S = new Stack<>();
		
		S.push(v);
		visited[v] = true;
		
		GraphNode node;
		while(!S.isEmpty()) {
			node = head[v];
			
			while(node != null) {
				if(visited[node.vertex] == false) {
					S.push(node.vertex);
					visited[node.vertex] = true;
					node = head[node.vertex];
				} else {
					node = node.link;
				}
			}
			
			v = S.pop();
		}
		
		int cnt = 0;
		for(int i = 0; i < visited.length; i++) {
			if(visited[i] == true) {
				cnt++;
			}
		}
		
		return cnt-1;
	}
}

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int vertexN = scan.nextInt();
		int edgeN = scan.nextInt();
		Graph G = new Graph(vertexN);
		
		int v1, v2;
		for(int i = 0; i < edgeN; i++) {
			v1 = scan.nextInt();
			v2 = scan.nextInt();
			
			G.insertEdge(v1, v2);
			G.insertEdge(v2, v1);
		}
		
		System.out.println(G.DFS(1));
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
