package com.study.kakaopay;

public class Heap {
	int heap[];
	int N;
	int index;

	public Heap(int N) {
		heap = new int[N + 1];
		this.N = N;
		index = 0;
	}

	public void insert(int k) {
		int i = ++index;
		heap[i] = k;
		
		int t;
		while(i >= 0 &&  heap[i] < heap[i/2]) {
			t = heap[i/2];
			heap[i/2] = heap[i];
			heap[i] = t;
			i = i/2;
		}
	}
	
	public int delete() {
		int rs = heap[1];
		
		heap[1] = heap[index];
		heap[index] = 0;
		index--;
		
		int parent = 1;
		int child = parent;
		
		while(child < index) {
			child = parent  * 2;
			if(child < index && heap[child] > heap[child + 1]) {
				child++;
			}
			
			if(child <= index && heap[parent] > heap[child]) {
				int t= heap[child];
				heap[child] = heap[parent];
				heap[parent] = t;
				parent = child;
			} else {
				break;
			}
		}

		return rs;
	}

	public static void main(String[] args) {
		Heap h = new Heap(100);
		for(int i = 0; i < 100; i++) {
			h.insert((int)(Math.random() * 100));
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println(h.delete());
		}
		
	}

}
