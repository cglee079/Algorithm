package com.baekjoon.q01991;

import java.util.HashMap;
import java.util.Scanner;

class Node {
	Node left;
	String value;
	Node right;

	public Node(String value) {
		super();
		this.value = value;
	}
}

public class Main {
	HashMap<String, Node> nodeMap = new HashMap<>();

	public void printPreorder(Node parent) {
		if(parent != null) {
			System.out.print(parent.value);
			printPreorder(parent.left);
			printPreorder(parent.right);
		}
	}
	
	public void printInorder(Node parent) {
		if(parent != null) {
			printInorder(parent.left);
			System.out.print(parent.value);
			printInorder(parent.right);
		}
	}
	
	public void printPostorder(Node parent) {
		if(parent != null) {
			printPostorder(parent.left);
			printPostorder(parent.right);
			System.out.print(parent.value);
		}
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String p, l, r;
		Node pno, lno, rno;
		Node parent;

		for (int i = 1; i <= n; i++) {
			pno = null;
			rno = null;
			lno = null;
			
			p = scan.next();
			l = scan.next();
			r = scan.next();
			
			pno = nodeMap.get(p);
			if(pno == null) {
				pno = new Node(p);
				nodeMap.put(p, pno);
			}
			
			if(!l.equals(".")) {
				lno = nodeMap.get(l);
				if(lno == null) {
					lno = new Node(l);
					nodeMap.put(l, lno);
				}
				
				pno.left = lno;
			}
			
			if(!r.equals(".")) {
				rno = nodeMap.get(r);
				if(rno == null) {
					rno = new Node(r);
					nodeMap.put(r, rno);
				}
				
				pno.right = rno;
			}
		}
		
		parent = nodeMap.get("A");
		printPreorder(parent);
		System.out.println("");
		printInorder(parent);
		System.out.println("");
		printPostorder(parent);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
