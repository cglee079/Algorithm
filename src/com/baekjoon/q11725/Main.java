/*package com.baekjoon.q11725;

import java.util.HashMap;
import java.util.Scanner;

class Line {
	int x, y;

	public Line(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
public class Main {
	public void run() {
		 Scanner scan = new Scanner(System.in);
		 HashMap<Integer, Line> lineSE = new HashMap<>();
		 HashMap<Integer, Line> lineES = new HashMap<>();
		 
		 int n = scan.nextInt();
		 int x;
		 int y;
		 Line ln;
		 for(int i = 1 ; i <= n; i++) {
			 x = scan.nextInt();
			 y = scan.nextInt();
			 ln = new Line(x,y);
			 lineSE.put(x, ln);
			 lineES.put(y, ln); 
		 }
		 
		 for(int i = 1; i <=n; i++) {
			 lineSE.get(1)
		 }
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
*/