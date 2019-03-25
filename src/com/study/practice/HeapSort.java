package com.study.practice;

import java.util.Arrays;

class Heap {
	int arr[];
	int index;
	int n;

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

		while (i >= 1 && arr[i] < arr[i / 2]) {
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
		int child = 1;
		while (child <= index) {
			child = parent * 2;

			if (child + 1 <= index && arr[child + 1] < arr[child]) {
				child++;
			}

			if (child <= index && arr[parent] > arr[child]) {
				swap(parent, child);
			} else {
				break;
			}

			parent = child;
		}

		return rs;
	}

}

public class HeapSort {

	public void run(int arr[]) {
		Heap h = new Heap(arr.length);

		for (int i = 0; i < arr.length; i++) {
			h.insert(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = h.delete();
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 4, 3, 4, 100, 20, 30, 10 };
		new HeapSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}
}
