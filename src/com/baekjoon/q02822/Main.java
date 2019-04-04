package com.baekjoon.q02822;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = 8;
		int[] ps = new int[n];
		for(int i = 0; i < n; i++) {
			ps[i] = scan.nextInt();
		}
		
		int rs = 0;
		int max = 0;
		int index = -1;
		for(int i = 0; i < 5; i++) {
			max = 0;
			index = -1;
			
			for(int j = 0; j < n; j++) {
				if(ps[j] > max) {
					max = ps[j];
					index = j;
				}
			}
			
			rs += max;
			ps[index] = -1;
		}
		
		System.out.println(rs);
		for(int i = 0; i < n; i++) {
			if(ps[i] == -1) {
				System.out.print((i+1) + " ");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
