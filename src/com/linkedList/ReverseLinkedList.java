package com.linkedList;

public class ReverseLinkedList {
	static Node head;

	public static void main(String[] args) {
		ReverseLinkedList l1 = new ReverseLinkedList();
		l1.addBegin(10);
		l1.addBegin(11);
		l1.addBegin(12);
		l1.addBegin(13);
		l1.addBegin(14);
		l1.addBegin(15);
		l1.addBegin(16);
		l1.addBegin(17);
		reverseLinkedList();
		
		

	}
	public void addBegin(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	private static void reverseLinkedList() {

		Node current = head;
		Node prev = null;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		display();
	}
	
	private static void display() {
		// For printing Linked List
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

}
