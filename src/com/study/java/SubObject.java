package com.study.java;

class SuperObject{
	public SuperObject(String str) {
		System.out.println("Make Super!! " + str);
	}
	
	public void draw() {
		System.out.println("Super!");
	}
}

public class SubObject extends SuperObject{
	public SubObject(String str, String str2) {
		super(str);
		System.out.println("Make Sub!! " + str2);
	}
	
	public void draw() {
		System.out.println("Sub!");
		super.draw();
	}

	public static void main(String[] args) {
		SuperObject obj1 = new SubObject("Hello", "World");
		obj1.draw(); // Sub! »£√‚
	}
}
