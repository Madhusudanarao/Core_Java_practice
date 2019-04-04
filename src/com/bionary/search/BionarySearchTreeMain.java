package com.bionary.search;

public class BionarySearchTreeMain {

	public static void main(String[] args) {
		BionarySearchTree bst = new BionarySearchTree();
		TreeNode rootNode = new TreeNode(15);
		bst.insert(null, rootNode);
		bst.insert(rootNode, new TreeNode(20));
		bst.insert(rootNode, new TreeNode(5));
		bst.insert(rootNode, new TreeNode(8));
		bst.insert(rootNode, new TreeNode(17));
		bst.insert(rootNode, new TreeNode(25));
		bst.insert(rootNode, new TreeNode(3));
		bst.insert(rootNode, new TreeNode(4));
		bst.insert(rootNode, new TreeNode(16));
		bst.insert(rootNode, new TreeNode(12));

		bst.printTree(rootNode);
		
		Boolean flag  = bst.find(rootNode,20);
		System.out.println("Data to be found  "+flag);
		
		TreeNode parent =  bst.findItsParent(rootNode,20);
		System.out.println(parent.data);

	}

}
