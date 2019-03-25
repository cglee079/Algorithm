package com.study.structure.stack;

class Stack {
	int top;
	int arr[];
	int n;

	public Stack(int n) {
		top = -1;
		this.n = n;
		arr = new int[n];
	}

	public boolean isFull() {
		return top == n - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int k) {
		if (isFull()) {
			throw new RuntimeException("Stack is Full");
		}

		arr[++top] = k;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}

		int rs = arr[top];
		arr[top] = 0;
		top--;

		return rs;
	}
}

public class Main {
	public static void main(String[] args) {
		Stack s = new Stack(1);
		s.push(1);
		s.pop();
		s.pop();

	}
}
