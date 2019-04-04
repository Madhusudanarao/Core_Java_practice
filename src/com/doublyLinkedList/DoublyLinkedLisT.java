package com.doublyLinkedList;

public class DoublyLinkedLisT {
	private DoubleNode head;
	private DoubleNode tail;
	int size;
 
	public boolean isEmpty() {
		return (head == null);
	}
 
	// used to insert a DoubleNode at the start of linked list
	public void insertFirst(int data) {
		DoubleNode newDoubleNode = new DoubleNode();
		newDoubleNode.data = data;
		newDoubleNode.next = head;
		newDoubleNode.prev = null;
		if(head!=null)
			head.prev=newDoubleNode;
		head = newDoubleNode;
		if(tail==null)
			tail=newDoubleNode;
		size++;
	}
 
	// used to insert a DoubleNode at the start of linked list
	public void insertLast(int data) {
		DoubleNode newDoubleNode = new DoubleNode();
		newDoubleNode.data = data;
		newDoubleNode.next = null;
		newDoubleNode.prev=tail;
		if(tail!=null)
			tail.next=newDoubleNode;
		tail = newDoubleNode;
		if(head==null)
			head=newDoubleNode;
		size++;
	}
	// used to delete DoubleNode from start of Doubly linked list
	public DoubleNode deleteFirst() {
 
		if (size == 0) 
			throw new RuntimeException("Doubly linked list is already empty");
		DoubleNode temp = head;
		head = head.next;
		head.prev = null;
		size--;
		return temp;
	}
 
	// used to delete DoubleNode from last of Doubly linked list
	public DoubleNode deleteLast() {
 
		DoubleNode temp = tail;
		tail = tail.prev;
		tail.next=null;
		size--;
		return temp;
	}
 
 
	// Use to delete DoubleNode after particular DoubleNode
	public void deleteAfter(DoubleNode after) {
		DoubleNode temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next.next.prev=temp;
		temp.next = temp.next.next;
 
	}
 
	// Use to insert DoubleNode after particular DoubleNode
	public void insertAfter(DoubleNode after, DoubleNode insert) {
		DoubleNode temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null) {
			DoubleNode tempNod = temp.next;
			temp.next.prev = insert;
			temp.next=insert;
			insert.prev = temp;
			insert.next = tempNod;
		}

	}
	 
	
	// For printing Doubly Linked List forward
	public void printLinkedListForward() {
		System.out.println("Printing Doubly LinkedList (head --> tail) ");
		DoubleNode current = head;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
 
	// For printing Doubly Linked List forward
	public void printLinkedListBackward() {
		System.out.println("Printing Doubly LinkedList (tail --> head) ");
		DoubleNode current = tail;
		while (current != null) {
			current.display();
			current = current.prev;
		}
		System.out.println();
	}

}
