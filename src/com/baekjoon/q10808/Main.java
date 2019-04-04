package com.baekjoon.q10808;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char[] cs = str.toCharArray();
		
		int[] count = new int['z' - 'a' + 1];
		
		for(int i = 0; i < cs.length; i++) {
			count[cs[i] - 'a']++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
		

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
