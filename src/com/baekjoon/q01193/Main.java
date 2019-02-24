package com.baekjoon.q01193;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int lr = -1;
		int n;
		int a = 1;
		int b = 1;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		while(true) {
			if(b >= n) {
				break; 
			}
			
			a = a + 1;
			b = b + a;
			lr = lr * -1;
		}
		
		int t =0 ,d = 0;
		int bBefore = b - a;
		
		if(lr == 1) {
			t = 1;
			d = a;
			for(int i = bBefore + 1; i < n; i++ ) {
				t++;
				d--;
			}
		} else if(lr == -1) {
			t = a;
			d = 1;
			for(int i = bBefore+1; i < n; i++ ) {
				t--;
				d++;
			}
		}
		
		
		System.out.println(t + "/" + d);
		
	}
}
