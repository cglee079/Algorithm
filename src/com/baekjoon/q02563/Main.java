package com.baekjoon.q02563;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);
		
		int [][] map = new int[101][101];
		
		int n = scan.nextInt();
		int x;
		int y;
		for(int i = 0; i < n; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			
			for(int a = x; a < x + 10; a++) {
				for(int b = y; b < y + 10; b++) {
					if(a <= 100 && b <= 100) {
						map[a][b] = -1;
					}
				}
			}
		}
		
		int rs = 0;
		for(int i = 1; i <=100; i++) {
			for(int j = 1; j <= 100; j++) {
				if(map[i][j] == -1) {
					rs += 1;
				}
			}
		}
		
		System.out.println(rs);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
