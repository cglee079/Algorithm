package com.study.graph.dfs;

class StackNode{
	int value;
	StackNode link;
}

class LinkedStack{
	StackNode top;
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int value) {
		StackNode newNode = new StackNode();
		newNode.value = value;
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() {
		int v;
		if(isEmpty()) {
			return -1;
		} else {
			v = top.value;
			top = top.link;
			return v;
		}
	}
}

class QNode{
	int data;
	QNode link;
}

class LinkedQueue{
	QNode front = null;
	QNode rear = null;

	public boolean isEmpty(){
		return front == null;
	}
	public void enque(int data) {
		QNode newNode= new QNode();
		newNode.data = data;
		newNode.link = null;
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	public int deque() {
		if(isEmpty()) {
			return -1;
		}
		
		int value = front.data;
		front = front.link;
		
		if(front == null) {
			rear = null;
		}
		return value;
	}
}


class GraphNode{
	int vertex;
	GraphNode link;
}

class AdjList{
	GraphNode head[] = new GraphNode[100];
	int vertex =0;
	
	public void insertVertex() {
		vertex++;
	}
	
	public void insertEdg(int v1, int v2) {
		GraphNode newNode = new GraphNode();
		newNode.vertex = v2;
		newNode.link = head[v1];
		head[v1] = newNode;
	}
	
	public void DFS(int sv) {
		boolean visited[] = new boolean[vertex];
		for(int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		
		LinkedStack S = new LinkedStack();
		
		S.push(sv);
		visited[sv] = true;
		System.out.printf("%c", sv+65);
		
		GraphNode node;
		
		while(!S.isEmpty()) {
			node = head[sv];
			
			while(node != null) {
				if(visited[node.vertex] == false) {
					S.push(node.vertex);
					visited[node.vertex] = true;
					System.out.printf("%c", node.vertex+65);
					node = head[node.vertex];
				} else {
					node = node.link;
				}
			}
			
			sv = S.pop();
		}
	}
	
	public void BFS(int v) {
		boolean visited[] = new boolean[vertex];
		LinkedQueue Q = new LinkedQueue();
		visited[v] = true;
		
		Q.enque(v);
		GraphNode node;
		int temp;
		System.out.printf("%c", v + 65);
		while(!Q.isEmpty()) {
			v = Q.deque();
			node = head[v];
			while(node != null) {
				temp = node.vertex;
				if(visited[temp] == false) {
					visited[temp] = true;
					System.out.printf("%c", temp + 65);
					Q.enque(temp);
				} 
				node = node.link;
			}
		}
		
	}
}

public class Main {
	public void run() {
		AdjList G = new AdjList();
		
		for(int i=0; i < 7; i++) {
			G.insertVertex();
		}
		
		G.insertEdg(0, 2);
		G.insertEdg(0, 1);
		G.insertEdg(1, 4);
		G.insertEdg(1, 3);
		G.insertEdg(1, 0);
		G.insertEdg(2, 4);
		G.insertEdg(2, 0);
		G.insertEdg(3, 6);
		G.insertEdg(3, 1);
		G.insertEdg(4, 6);
		G.insertEdg(4, 2);
		G.insertEdg(4, 1);
		G.insertEdg(5, 6);
		G.insertEdg(6, 5);
		G.insertEdg(6, 4);
		G.insertEdg(6, 3);
		
		//G.DFS(0);
		G.BFS(0);
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
