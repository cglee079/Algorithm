package com.baekjoon.q01552;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine().trim();

		String[] ins = in.split(" ");
		if (ins.length == 1 && ins[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(ins.length);
		}
	}
}
