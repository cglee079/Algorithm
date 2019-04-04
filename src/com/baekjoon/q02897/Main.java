package com.baekjoon.q02897;

import java.util.Scanner;

public class Main {
	public int checkCount(char[][] map, int i, int j) {
		int cnt = 0;
		if(map[i][j] == 'X') {cnt++;}
		if(map[i][j+1] == 'X') {cnt++;}
		if(map[i+1][j] == 'X') {cnt++;}
		if(map[i+1][j+1] == 'X') {cnt++;}
		return cnt;
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		int[] counts = new int[5];
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		char[][] map = new char[r][c];
		
		String str;
		for(int i = 0; i < r; i++) {
			str = scan.next();
			map[i] = str.toCharArray();
		}
		
		int cnt;
		for(int i = 0; i <= r - 2; i++) {
			for(int j = 0; j <= c - 2; j++) {
				if(map[i][j] == '#'
					|| map[i][j+1] == '#'
					|| map[i+1][j] == '#'
					|| map[i+1][j+1] == '#') {
					continue;
				} else {
					cnt = checkCount(map, i, j);
					counts[cnt]++;
				}
			}
		}
		
		for(int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
