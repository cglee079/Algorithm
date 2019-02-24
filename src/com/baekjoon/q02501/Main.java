package com.baekjoon.q02501;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		List<Integer> p = new ArrayList<>();
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				p.add(i);
			}
		}
		
		Collections.sort(p);
		if(p.size() < b) {
			System.out.println(0);
		} else {
			System.out.println(p.get(b-1));
		}
		
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
