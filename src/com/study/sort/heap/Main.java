package com.study.sort.heap;

class Heap {
	int index;
	int n;
	int arr[];

	public Heap(int n) {
		this.n = n;
		this.arr = new int[n + 1];
		this.index = 0;
	}

	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public void insert(int k) {
		int i = ++index;
		arr[i] = k;

		while (i > 1 && arr[i] < arr[i / 2]) {
			swap(i, i / 2);
			i = i / 2;
		}
	}

	public int delete() {
		int rs = arr[1];
		arr[1] = arr[index];
		arr[index] = 0;
		index--;

		int parent = 1;
		int child = parent;
		while (child < index) {
			child = parent * 2;
			if (child < index && arr[child + 1] < arr[child]) {
				child = child + 1;
			}

			if (child <= index && arr[child] < arr[parent]) {
				swap(parent, child);
				parent = child;
			} else {
				break;
			}
		}

		return rs;
	}
}

public class Main {
	public static void main(String[] args) {
		int n = 100;
		Heap h = new Heap(n);
		for (int i = 0; i < n; i++) {
			h.insert((int) (Math.random() * n) + 1);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(h.delete());
		}

	}
}
