package com.study.practice;

import java.util.Arrays;

public class InsertionSort {
	public void run(int arr[]) {
		int n = arr.length;
		
		int i;
		int j;
		int k;
		
		for(i = 1; i < n; i++) {
			k = arr[i];
			for(j = i - 1; j >= 0; j--) {
				if(arr[j] > k) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			
			arr[j+1] = k;
		}
		
		
	}
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 4, 3, 4, 100, 20, 30, 10};
		new InsertionSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}
}
