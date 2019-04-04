package com.baekjoon.q03187;

import java.util.Scanner;

public class Main {
	char[][] map;
	int r;
	int c;
	int m;
	int w;
	
	int mCnt = 0;
	int wCnt = 0;
	
	public void dfs(int i, int j) {
		if(i < 0 || i > r || j < 0 || j > c || map[i][j] == '#') {
			return;
		}
		
		if(map[i][j] == 'v') {
			wCnt++;
		}
		
		if(map[i][j] == 'k') {
			mCnt++;
		}
		
		map[i][j] = '#';
		
		dfs(i, j + 1);
		dfs(i, j - 1);
		dfs(i + 1, j);
		dfs(i - 1, j);
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);

		r = scan.nextInt();
		c = scan.nextInt();
		map = new char[r][c];
		
		String str;
		for(int i = 0; i < r; i++) {
			str = scan.next();
			map[i] = str.toCharArray();
			for(int j = 0; j < c; j++) {
				if(map[i][j] == 'v') {
					w++;
				}
				if(map[i][j] == 'k') {
					m++;
				}
			}
		}
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(map[i][j] == 'v' || map[i][j] == 'k') {
					mCnt = 0;
					wCnt = 0;
					dfs(i, j);
					if(mCnt > wCnt) {
						w -= wCnt;
					} else{
						m -= mCnt;
					}
				}
			}
		}
		
		System.out.print(m +  " " + w);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
