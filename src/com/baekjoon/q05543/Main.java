package com.baekjoon.q05543;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);
		
		int rs = 0;
		int k;
		int min;
		
		min = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			k = scan.nextInt();
			if(k < min) {
				min = k;
			}
		}
		
		rs += min;
		
		min = Integer.MAX_VALUE;
		for(int i = 0; i < 2; i++) {
			k = scan.nextInt();
			if(k < min) {
				min = k;
			}
		}
		
		rs += min;
		
		System.out.println(rs - 50);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
