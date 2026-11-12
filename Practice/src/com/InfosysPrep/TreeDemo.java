package com.InfosysPrep;

public class TreeDemo {
	
   public static void inOrder(Node root) {
	   if(root == null) return ;
	   inOrder(root.left);
	   System.out.print(root.data+" ");
	   inOrder(root.right);
   }	
   
   public static void preOrder(Node root) {
	   if(root == null) return ;
	   System.out.print(root.data+" ");
	   preOrder(root.left);
	   preOrder(root.right);
	   
   }
   
   public static void postOrder(Node root) {
	   if(root == null) return ;
	   postOrder(root.left);
	   postOrder(root.right);
	   System.out.print(root.data+" ");
	   
   }
   
   public static int treeHeight(Node root) {
	   if(root == null) return 0;
	   
	   int left = treeHeight(root.left);
	   int right = treeHeight(root.right);
	   
	  return 1+Math.max(left, right);
	   
   }
	
   public static int count(Node root) {
	   if(root == null) return 0;
	   
	   int left = count(root.left);
	   int right = count(root.right);
	    return 1+left+right;
	   
   }
   
   public static void main(String[] args) {
	Node root = new Node(10);
	root.left = new Node(5);
	root.right = new Node(20);
	root.left.left = new Node(3);
	root.left.right = new Node(7);
	inOrder(root);
	System.out.println();
	preOrder(root);
	System.out.println();
	postOrder(root);
	System.out.println();
    System.out.println(treeHeight(root));
    System.out.println();
    System.out.println(count(root));
    
}
}
