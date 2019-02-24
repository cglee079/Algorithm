package com.baekjoon.q11444;

import java.util.Scanner;

class Matrix {
	long a;
	long b;
	long c;
	long d;

	public Matrix() {
		a = 1;
		b = 1;
		c = 1;
		d = 0;
	}

	public Matrix(long a, long b, long c, long d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
}

public class Main {
	static long mod = 1000000007;
	public static Matrix multi(Matrix mx, Matrix my) {
		Matrix m = new Matrix();
		m.a = mx.a * my.a + mx.b * my.c;
		m.b = mx.a * my.b + mx.b * my.d;
		m.c = mx.c * my.a + mx.d * my.c;
		m.d = mx.c * my.b + mx.d * my.d;
		
		m.a %= mod;
		m.b %= mod;
		m.c %= mod;
		m.d %= mod;
		
		
		return m;
	}
	
	public static long fibo(int n) {
		Matrix m = new Matrix();
		if(n == 0) { return 0; }
		if(n == 1) { return 1; }
		if(n >= 2) {
			while(n > 0) {
				if(n % 2 == 1) {
					m = multi(m, new Matrix());
				}  
				m = multi(m,  new Matrix());
				n = n / 2;
			}
			
			return m.c;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fibo(n)); 
		
	}
}
