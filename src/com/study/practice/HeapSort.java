package com.study.practice;

import java.util.Arrays;

class Node{
}

class Heap {
	int n;
	int arr[];
	int index;
	
	public Heap(int n) {
		this.n = n;
		this.arr = new int[n+1];
		this.index = 0;
	}
	
	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public boolean isFull() {
		return index == n;
	}
	
	public void insert(int k) {
		if(isFull()) {
			return ;
		}
		
		int i = ++index;
		arr[i] = k;
		
		while(i > 1 && arr[i] < arr[i/2]) {
			swap(i, i/2);
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
		
		while(child <= index) {
			child = parent * 2;
			if(child +1 <= index && arr[child] > arr[child+1]) {
				child++;
			}
			
			if(child <= index && arr[parent] > arr[child]) {
				swap(parent, child);
				parent *= 2;
			} else {
				break;
			}
		}
		
		return rs;
	}
}

public class HeapSort {

	public void run(int arr[]) {
		Heap h = new Heap(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			h.insert(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(h.delete());
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 4, 3, 4, 100, 20, 30, 10 };
		new HeapSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}
}
