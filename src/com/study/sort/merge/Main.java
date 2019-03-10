package com.study.sort.merge;

import java.util.Arrays;

class Mergesort {
	int arr[];
	int temp[];
	int n;

	public Mergesort(int arr[]) {
		this.arr = arr;
		this.n = arr.length;
		this.temp = new int[n];
	}
	
	public void run() {
		this.division(0, n- 1);
	}
	
	public void sort(int left, int right) {
		int mid = (left + right) / 2;
		int k = left;
		int i = left;
		int j = mid + 1;
		
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		if(i > mid) {
			for(int l = j; l <= right; l++) {
				temp[k++] = arr[l];
			}
		}
		
		if(j > right) {
			for(int l = i; l <= mid; l++) {
				temp[k++] = arr[l];
			}
		}
		
		for(int l = left; l <= right; l++) {
			arr[l] = temp[l];
		}
		
	}

	public void division(int left, int right) {
		if(left < right) {
			int mid = (left + right) /2;
			division(left, mid);
			division(mid + 1, right);
			sort(left, right);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		int arr[] = { 10, 8, 1, 7, 3, 2, 15, 9, 5 };
		new Mergesort(arr).run();
		System.out.print(Arrays.toString(arr));
		
	}
}
