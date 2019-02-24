package com.study.kakaopay;

class Queue {
	int queue[];
	int front, rear;
	int size;

	public Queue(int n) {
		size = n;
		queue = new int[n];
		front = 0;
		rear = 0;
	}

	public boolean isFull() {
		if ((rear + 1) % size == front) {
			System.out.println("FULL!");
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == rear) {
			System.out.print("EMPTY !!");
			return true;
		}
		return false;
	}

	public void enQueue(int k) {
		if (isFull()) {
			return;
		}

		rear = (rear + 1) % size;
		queue[rear] = k;
	}

	public int deQueue() {
		if (isEmpty()) {
			return -1;
		}

		front = (front + 1) % size;
		return queue[front];
	}
}

public class Main {
	public static void main(String[] args) {
		Queue q = new Queue(5);

		Stack s = new Stack(5);
		s.push(0);
		s.push(1);
		s.push(1);
		s.push(1);
		s.push(1);

		for (int i = 0; i < 6; i++) {
			System.out.println(s.pop());
		}
	}
}

class Stack {
	int[] stack;
	int top;

	public Stack(int n) {
		stack = new int[n];
		top = -1;
	}

	public boolean isFull() {
		if (top == stack.length - 1) {
			System.out.println("FULL!!");
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			System.out.print("EMPTY!!");
			return true;
		}
		return false;
	}

	public void push(int k) {
		if (isFull()) {
			return;
		}
		stack[++top] = k;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		return stack[top--];
	}

}
