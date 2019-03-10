package com.study.math.jinsoo;

public class Main {
	
	public String jinsoo(int n, int k) {
		StringBuilder str = new StringBuilder();
		char num[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		while(n >= k) {
			str.append(num[n % k]);
			n = n / k;
		}
		
		if(n != 0) {
			str.append(num[n]);
		}
		
		return str.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		int n = 1000;
		int k = 16;
		
		System.out.print(new Main().jinsoo(n, k));
		
	}

}
