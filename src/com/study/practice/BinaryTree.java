package com.study.practice;

public class BinaryTree {

	public void inOrder(TreeNode node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getValue() + " ");
			inOrder(node.getRight());
		}
	}

	public void preOrder(TreeNode node) {
		if (node != null) {
			System.out.print(node.getValue() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	public void postOrder(TreeNode node) {
		if (node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getValue() + " ");
		}
	}

	public static void main(String[] args) {
		TreeNode root;
		root = new TreeNode(1);

		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		left.setLeft(new TreeNode(4));
		left.setRight(new TreeNode(5));
		right.setLeft(new TreeNode(6));
		right.setRight(new TreeNode(7));
		root.setLeft(left);
		root.setRight(right);
		
		BinaryTree btree = new BinaryTree();
		btree.inOrder(root);
		System.out.println("");
		btree.preOrder(root);
		System.out.println("");
		btree.postOrder(root);
		System.out.println("");
	}
}

class TreeNode {
	TreeNode left;
	int value;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}