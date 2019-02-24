package com.baekjoon.q02292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1,7,19,37,61
		//0,6,12,18,24
		
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		
		int s = 1;
		int g = 0;
		int t = 0;
		
		while(true) {
			g = t * 6;
			s = s + g;
			if( s >= n) {
				break;
			}
			t++;			
		}
		
		System.out.println(t + 1);
	}
}
