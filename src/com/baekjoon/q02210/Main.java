package com.baekjoon.q02210;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	int map[][];
	HashSet<String> strs = new HashSet<String>();
	
	public void make(int i, int j, String str) {
		if(i > 5 || i < 1 || j > 5 || j < 1) {
			return;
		}
		
		str = str + map[i][j];
		if(str.length() == 6) {
			strs.add(str);
			return;
		}
		
		int dx[] = {0, 0, -1, 1};
		int dy[] = {-1, 1, 0, 0};
		
		for(int a = 0; a < 4; a++) {
			make(i+dx[a], j + dy[a], str);
		}
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n;

		n = 5;
		map = new int[n+1][n+1];
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				make(i, j, ""); 
			}
		}

		System.out.print(strs.size());
	}

	public static void main(String[] args) {
		new Main().run();
	}
}