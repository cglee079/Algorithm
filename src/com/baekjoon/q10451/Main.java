package com.baekjoon.q10451;

import java.util.Arrays;
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
		this.vertex = vertex;
		head = new GraphNode[vertex + 1];
	}

	public void insertEdge(int v1, int v2) {
		GraphNode nd = new GraphNode();
		nd.vertex = v2;
		nd.link = head[v1];
		head[v1] = nd;
	}
	
	public int DFS(boolean visited[], int v) {
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
		int t = scan.nextInt();
		
		for(int k = 0; k < t; k ++) {
			int vertexN = scan.nextInt();
			Graph G = new Graph(vertexN);
			
			int v1;
			for(int i = 0; i < vertexN; i++) {
				v1 = scan.nextInt();
				
				G.insertEdge(i+1 , v1);
				G.insertEdge(v1, i+1);
			}
			
			boolean visited[] = new boolean[vertexN + 1];
			visited[0]= true;
			int index = -1;
			int count = 0;
			while(true) {
				index = -1;
				for(int i = 1; i < visited.length; i++) {
					if(visited[i] == false) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					break;
				}
				
				G.DFS(visited, index);
				
				count++;
				
			}
			
			System.out.println(count);
		}
		
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
