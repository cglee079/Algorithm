package com.study.structure.queue;

class Queue {
	int front;
	int rear;
	int arr[];
	int n;

	public Queue(int n) {
		this.n = n;
		this.arr = new int[n];
		this.front = -1;
		this.rear = -1;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear == n - 1;
	}
	
	public void enque(int k) {
		if(isFull()) {
			System.out.print("Queue is Full");
			return ;
		}
		
		arr[++rear] = k;
	}
	
	public int deque() {
		if(isEmpty()){
			System.out.print("Queue is Empty");
			return -1;
		}
		
		int rs = arr[++front];
		arr[front] = 0;
		
		return rs;
	}
}

public class Main {
	public static void main(String[] args) {
		int n = 3;
		Queue q = new Queue(n);
		
		for(int i = 0; i < n; i++) {
			q.enque(i);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(q.deque() + " ");
		}
	}
}
