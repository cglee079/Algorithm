package com.baekjoon.q01100;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int r = 8;
		char[][] map = new char[r][r];
		String str;
		for (int i = 0; i < r; i++) {
			str = scan.next();
			map[i] = str.toCharArray();
		}
		
		int count = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if((i + j) % 2 == 0 && map[i][j] == 'F') {
					count++;
				}
			}
		}

		System.out.println(count);
		
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
