package com.bionary.search;

public class BionarySearchTree {
	
	public void insert(TreeNode root, TreeNode nodeToBeInserted) {
		if (root == null) {
			root = nodeToBeInserted;
		}
		if (root.data > nodeToBeInserted.data) {
			if (root.left == null)
				root.left = nodeToBeInserted;
			else
				insert(root.left, nodeToBeInserted);

		}

		if (root.data < nodeToBeInserted.data) {
			if (root.right == null)
				root.right = nodeToBeInserted;
			else
				insert(root.right, nodeToBeInserted);

		}
	}

	void printTree(TreeNode node) {
		if (node == null)
			return;

		System.out.println(" " + node.data);
		printTree(node.left);
		printTree(node.right);
	}

	public Boolean find(TreeNode root, int data) {
		boolean flag = false;
		if (root == null) {
			System.out.println("data not found " + data);
			flag = false;
		}
		if (root.data == data) {
			System.out.println("data  found " + data);
			flag = true;
		}
		if (root.data > data) {
			flag = find(root.left, data);
		}
		if (root.data < data) {

			flag = find(root.right, data);
		}
		return flag;
	}
	
	public TreeNode findItsParent(TreeNode root, int data) {
		TreeNode parent = null;
		TreeNode save = null;
		TreeNode temp = null;
		if (root == null) {
			parent = null;
		}
		if (root.data  == data) {
			parent = null;
		}
		
		if (root.data > data)
			temp = root.left;
		else
			temp = root.right;
		
		save = root;

		while (temp != null) {
				if (temp.data == data) {
					System.out.println("data  found and its parent " + temp);
					parent 	 = temp;
					break;
				} else {
					temp = temp.left;
				}

				if (temp.data == data) {
					System.out.println("data  found and its parent " + temp);
					parent 	 = temp;
					break;
				} else {
					temp = temp.right;

				}

		}

		return parent;
	}
	
	

}
