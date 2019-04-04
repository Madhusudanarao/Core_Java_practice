package com.doublyLinkedList;

public class DoubleLinkedDemo {
	public static void main(String[] args) {

		DoublyLinkedLisT myLinkedlist = new DoublyLinkedLisT();
		myLinkedlist.insertFirst(5);
		myLinkedlist.insertFirst(6);
		myLinkedlist.insertFirst(7);
		myLinkedlist.insertFirst(1);
		myLinkedlist.insertLast(2);
		myLinkedlist.printLinkedListForward();
		myLinkedlist.printLinkedListBackward();

		System.out.println("================");
		// Doubly Linked list will be
		// 1 -> 7 -> 6 -> 5 -> 2

		DoubleNode node = new DoubleNode();
		node.data = 1;
		myLinkedlist.deleteAfter(node);
		myLinkedlist.printLinkedListForward();
		myLinkedlist.printLinkedListBackward();
		// After deleting node after 1,doubly Linked list will be
		// 2 -> 1 -> 6 -> 5
		System.out.println("================");
		myLinkedlist.deleteFirst();
		myLinkedlist.deleteLast();

		// After performing above operation, doubly Linked list will be
		// 6 -> 5
		myLinkedlist.printLinkedListForward();
		myLinkedlist.printLinkedListBackward();
		
		DoubleNode node1t = new DoubleNode();
		node1t.data = 6;
		
		DoubleNode nodeInsert = new DoubleNode();
		nodeInsert.data = 10;
		myLinkedlist.insertAfter(node1t,nodeInsert);
		System.out.println("After insert");
		myLinkedlist.printLinkedListForward();
	}

}
