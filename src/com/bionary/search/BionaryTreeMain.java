package com.bionary.search;

public class BionaryTreeMain {

	public static void main(String[] args) {
		BionaryTree bt = new BionaryTree();
		TreeNode rootNode = new TreeNode(25);
		bt.insert(null, rootNode);
		bt.insert(rootNode, new TreeNode(15));
		bt.insert(rootNode, new TreeNode(30));
		bt.insert(rootNode, new TreeNode(14));
		bt.insert(rootNode, new TreeNode(16));
		bt.insert(rootNode, new TreeNode(32));
		bt.insert(rootNode, new TreeNode(33));
		
		bt.preOrderTraversal(rootNode);
		bt.inOrderIter(rootNode);
	}

}
