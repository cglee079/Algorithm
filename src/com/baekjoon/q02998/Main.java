package com.baekjoon.q02998;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		int n = str.length();
		
		int m = 0;
		if(n % 3 != 0) {
			m = 3 - (n % 3);
		}
		
		StringBuilder newStrBuilder = new StringBuilder();
		for(int i = 0; i < m; i++) {
			newStrBuilder.append("0");
		}
		newStrBuilder.append(str);
		
		String newStr = newStrBuilder.toString();
		char[] c = newStr.toCharArray();
		
		StringBuilder resultStrBuilder = new StringBuilder();
		int rs;
		for(int i = 0; i < c.length; i = i + 3) {
			rs = 0;
			if(c[i] == '1') {
				rs += (2 * 2);
			} 
			if(c[i+1] == '1') {
				rs += (2 * 1);
			}
			if(c[i+2] == '1') {
				rs += 1;
			}
			
			resultStrBuilder.append(rs);
		}
		
		System.out.println(resultStrBuilder.toString());
	}

	public static void main(String[] args) {
		new Main().run();
	}

}