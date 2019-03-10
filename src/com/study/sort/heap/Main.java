package com.study.sort.heap;

public class Main {
	private int index;
	private int heap[];

	public Main(int N) {
		index = 0;
		this.heap = new int[N + 1];
	}

	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public void insert(int a) {
		int i = ++index;
		heap[i] = a;

		while (i != 1 && heap[i] < heap[i / 2]) {
			swap(i, i / 2);
			i = i / 2;
		}
	}

	public int delete() {
		int result = heap[1];
		heap[1] = heap[index];
		heap[index] = 0;
		index--;

		int i = 1;
		int c = i;
		while (c < index) {

			c = i * 2;
			
			if (c < index && heap[c] > heap[c + 1]) {
				c++;
			}

			if (c <= index && heap[i] > heap[c]) {
				swap(i, c);
				i = c;
			} else {
				break;
			}
			
			

		}
		return result;
	}

	public static void main(String[] args) {
		int N = 100;
		Main M = new Main(N);

		for (int i = 0; i < N; i++) {
			M.insert((int) (Math.random() * N));
		}

		for (int i = 0; i < N; i++) {
			System.out.print(M.delete() + " ");
		}

	}
}
