package com.bionary.search;

import java.util.Stack;

public class BionaryTree {
	
	public void insert(TreeNode root, TreeNode nodeToBeInserted) {
		if (root == null) {
			root = nodeToBeInserted;
		}
		if (root.data > nodeToBeInserted.data) {
			if (root.left == null) {
				root.left = nodeToBeInserted;
			} else {
				insert(root.left, nodeToBeInserted);
			}

		}

		if (root.data < nodeToBeInserted.data) {
			if (root.right == null) {
				root.right = nodeToBeInserted;
			} else {
				insert(root.right, nodeToBeInserted);
			}

		}

	}
	
	//Iterative approach
	public void preOrderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.println("Data to print " + temp.data);
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);

			}

		}

	}
	
	public void inOrderIter(TreeNode root) {
		 
		if(root == null)
			return;
 
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode currentNode=root;
 
		while(!s.empty() || currentNode!=null){
 
			if(currentNode!=null)
			{
				s.push(currentNode);
				currentNode=currentNode.left;
			}
			else
			{
				TreeNode n=s.pop();
				System.out.printf("%d ",n.data);
				currentNode=n.right;
			}
		}
	}
	
	public void printLeafNode(TreeNode root){
		if(root.left==null && root.right==null){
			System.out.println("Leaf node %d"+root.data);
			printLeafNode(root.left);
			printLeafNode(root.right);
		}
		
	}

}
