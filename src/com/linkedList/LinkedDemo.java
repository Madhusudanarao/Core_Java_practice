package com.linkedList;

public class LinkedDemo {

	public static void main(String[] args) {
		LinkedLisT l1 = new LinkedLisT();
		l1.addBegin(10);
		l1.addBegin(11);
		l1.addBegin(12);
		l1.addBegin(13);
		l1.addBegin(14);
		l1.addBegin(15);
		l1.addBegin(16);
		l1.addBegin(17);

		l1.addAtEnd(100);
		l1.addSpecific(15, 50);
		l1.display();
		Node node = l1.findNthElementFromLast(2);
		Node nodeFromFirst = l1.findNthElementFromFirst(2);
		System.out.println(" "+node.data);
		System.out.println(" "+nodeFromFirst.data);

	}

}
