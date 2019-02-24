package com.baekjoon.q02644;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph{
	int vertex = 0;
	LinkedList<Integer> head[];
	
	public Graph(int humanN) {
		vertex = humanN;
		head = new LinkedList[humanN+1];
		
		for(int i = 1; i <= humanN; i++) {
			head[i] = new LinkedList<>();
		}
	}
	
	
	public void insertEdge(int x, int y) {
		head[x].add(y);
		head[y].add(x);
	}
	
	public int CalculateDistance(int x, int y) {
		boolean visited[] = new boolean[vertex +1];
		int dist[] = new int[vertex + 1];
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i =0; i <= vertex; i++) {
			dist[i] = -1;
		}
		
		if(x == y ) {
			return 0;
		}
		
		Q.add(x);
		dist[x] = 0;
		visited[x] = true;
		
		int v;
		int child;
		LinkedList<Integer> childs;
		while(!Q.isEmpty()) {
			v = Q.poll();
			childs = head[v];
			
			for(int i = 0; i < childs.size(); i++) {
				child = childs.get(i);
				if(visited[child] == false) {
					visited[child] = true;
					dist[child] = dist[v] + 1;
					Q.add(child);
				}
			}
		}
		
		
		
		return dist[y];
	}
	
}

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int humanN = scan.nextInt();
		int fx = scan.nextInt();
		int fy = scan.nextInt();
		int realationN = scan.nextInt();
		
		Graph g = new Graph(humanN);
		
		
		int x, y;
		for(int i = 1; i <= realationN; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			
			g.insertEdge(x, y);
			g.insertEdge(y, x);
		}
		
		System.out.println(g.CalculateDistance(fx, fy));
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
