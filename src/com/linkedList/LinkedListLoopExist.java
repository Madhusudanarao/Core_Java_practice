package com.linkedList;

public class LinkedListLoopExist {
	private Node head;

	public static void main(String[] args) {
		LinkedListLoopExist  lle = new LinkedListLoopExist();
		Node loopNode=new Node(30);
		lle.addAtEnd(new Node(10));
		lle.addAtEnd(new Node(20));
		lle.addAtEnd(loopNode);
		lle.addAtEnd(new Node(40));
		lle.addAtEnd(new Node(50));
		lle.addAtEnd(new Node(60));
		lle.addAtEnd(loopNode);
		lle.display();
	
		boolean flag = lle.loopExist();
		if(flag)
			System.out.println("Loop exist "+flag);
		else
			System.out.println("Loop does not exist "+flag);

	}

	private void addAtEnd(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
		
	}
	
	private void display() {
		Node currentNode = head;
		while (currentNode != null) {
			currentNode.display();
			currentNode = currentNode.next;
		}
	}
	
	private boolean loopExist() {

		Node previousNode = head;
		Node nextNode = head;
		while (nextNode != null && nextNode.next != null) {
			previousNode = previousNode.next;
			nextNode=nextNode.next.next;
			if(previousNode == nextNode)
				return true;
		}
		return false;

	}

}
