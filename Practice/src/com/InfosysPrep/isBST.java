package com.InfosysPrep;

public class isBST {
	
	public static boolean BST(Node root,int min,int max) {
		if(root == null) return true;
		if(root.data <= min || root.data >= max) 
			return false;
		return BST(root.left,min,max) && BST(root.right,min,max);
	}
	
    public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(6);
		root.right.right = new Node(16);
		boolean result = BST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println("Is BST : "+result);
	}
}
