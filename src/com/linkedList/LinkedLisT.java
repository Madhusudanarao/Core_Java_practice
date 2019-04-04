package com.linkedList;

public class LinkedLisT {
	Node head;

	public void LinkedListT() {
		head = null;
	}

	public void addBegin(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	public void addAtEnd(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;

	}

	public void addSpecific(int specificData, int data) {
		Node current = head;
		while (current.next != null && current.data != specificData) {
			current = current.next;
		}
		if (head.next == null) {
			System.out.println("Not found the data");
		} else {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = current.next;
			current.next = newNode;
		}

	}

	public void display() {
		// For printing Linked List
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
	
	public Node findNthElementFromLast(int count) {
		// For printing Linked List
		Node fp = head;
		Node sp = head;
		for (int i = 0; i < count; i++) {
			fp = fp.next;

		}
		
		while (fp != null) {
			fp= fp.next;
			sp= sp.next;
		}
		
		return sp;

	}
	
	public Node findNthElementFromFirst(int count) {
		// For printing Linked List
		Node fp = head;
		for (int i = 0; i < count-1; i++) {
			fp = fp.next;

		}
		
		return fp;

	}
}
