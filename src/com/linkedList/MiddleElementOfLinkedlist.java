package com.linkedList;

public class MiddleElementOfLinkedlist {
	static Node head;

	public static void main(String[] args) {

		MiddleElementOfLinkedlist mel = new MiddleElementOfLinkedlist();
		mel.addBegin(10);
		mel.addBegin(11);
		mel.addBegin(12);
		mel.addBegin(13);
		mel.addBegin(14);
		mel.addBegin(15);
		mel.addBegin(16);
		mel.addBegin(17);

		mel.display();
		Node node = findMiddleElement();
		System.out.println("middle element" + node.data);
	}

	private void display() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();

	}

	private void addBegin(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	private static Node findMiddleElement() {
		Node prevNode;
		Node nextNode;
		prevNode = head;
		nextNode = head;
		
		while (nextNode != null) {
			nextNode= nextNode.next;
			if (nextNode!=null && nextNode.next != null) {
				prevNode = prevNode.next;
				nextNode = nextNode.next;
			}
		}
		return prevNode;
	}

}
