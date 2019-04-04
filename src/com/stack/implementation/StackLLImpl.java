package com.stack.implementation;

public class StackLLImpl {

	public static Node root;
	
	public static void main(String[] args) {
		StackLLImpl sai  = new  StackLLImpl();
		sai.push(10);
		sai.push(20);
		sai.push(30);
		sai.push(40);
		sai.push(50);
		sai.print(root);
	}
	
	public void push(int element){
		Node previousNode = root;
		root = new Node();
		root.data= element;
		root.next= previousNode;
	}
	
	public void print(Node  root){
		while(root!=null){
			System.out.println("Data " +root.data);
			root= root.next;
		}
	}

}
