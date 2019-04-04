package com.baekjoon.q09550;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m;
		int k;
		int cnt;
		int rs = 0;
		
		
		for(int i = 0; i < n; i++) {
			rs = 0;
			m = scan.nextInt();
			k = scan.nextInt();
			for(int j = 0; j < m; j++) {
				cnt = scan.nextInt();
				rs += (cnt / k);
			}
			System.out.println(rs);
			
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
