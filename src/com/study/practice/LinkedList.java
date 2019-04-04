package com.study.practice;

public class LinkedList {
	LinkNode head;
	int size = 0;
	
	public void insert(int value) {
		LinkNode node = new LinkNode(value);
		if(head == null) {
			head = node;
			return;
		}
		
		LinkNode h = head;
		while(h.next != null) {
			h = h.next;
		}
		
		h.next = node;
		size ++;
	}
	
	public void delete(int k) {
		if(isEmpty()) {
			return ;
		}

		if(head.value == k) {
			head = head.next;
			return;
		}
		
		LinkNode h = head;
		LinkNode before = h;
		while(h != null) {
			if(h.value == k) {
				break;
			}
			before = h;
			h = h.next;
		}
		
		if(h == null) {
			return ;
		}
		
		before.next = h.next;
		
		
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void print() {
		LinkNode h = head;
		while(h != null) {
			System.out.print(h.value + " ");
			h = h.next;
		}
	}

	public void printRecur(LinkNode node) {
		if(node != null) {
			System.out.print(node.value + " ");
			printRecur(node.next);
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(3);
		list.insert(4);
		list.insert(10);
		
		list.delete(4);
		list.print();
		System.out.println(list.head.value);
	}
}

class LinkNode {
	LinkNode next;
	int value;

	public LinkNode(int value) {
		this.value = value;
	}
}