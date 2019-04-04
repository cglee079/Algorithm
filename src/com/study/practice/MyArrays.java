package com.study.practice;

import java.util.Arrays;

public class MyArrays {
	int[][] arr;
	
	public MyArrays(int n, int k) {
		arr = new int[n][k];
		
		int index = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				arr[i][j]  = index++;				
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));			
		}
	}
	
	public static void main(String[] args) {
		MyArrays myarr = new MyArrays(3, 3);
		myarr.print();
	}
}
