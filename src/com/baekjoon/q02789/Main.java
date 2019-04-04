package com.baekjoon.q02789;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		char[] c = "CAMBRIDGE".toCharArray();
		Set<Character> alpa = new HashSet<>();

		for (int i = 0; i < c.length; i++) {
			alpa.add(c[i]);
		}

		String str = scan.next();
		char[] inputChars = str.toCharArray();
		
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < inputChars.length; i++) {
			if (!alpa.contains(inputChars[i])) {
				answer.append(inputChars[i]);
			}
		}

		System.out.println(answer.toString());
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
