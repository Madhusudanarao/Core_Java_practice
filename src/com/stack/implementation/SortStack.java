package com.stack.implementation;

public class SortStack {
	public static int size = 5;
	public int stack[];
	public int top ;
	public SortStack(int size) {
		this.size= size;
		this.stack = new  int[size];
		this.top=-1;
		
	}
	
	public SortStack() {
		this.size= size;
		this.stack = new  int[size];
		this.top=-1;
		
	}

	public static void main(String[] args) {
		SortStack ss = new SortStack();
		System.out.println("Stack insert");
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		ss.push(50);
		ss.sortStack(ss);

	}
	
	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is full and overflow");
		} else {
			top++;
			stack[top] = element;
			System.out.println("Inserted data is "+element);
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty and underflow");
			return -1;
		} else {
			int currentElement = stack[top];
			top--;
			System.out.println("Inserted data is "+currentElement);
			return currentElement;
		}
	}
	
		public int peek() {
			return stack[top];
		}
	
	public boolean isFull(){
		return (size - 1 == top);
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public SortStack sortStack(SortStack stack) {
		SortStack tempStack = new SortStack(5);
		while (!stack.isEmpty()) {
			int currentElement = stack.pop();
			while (!tempStack.isEmpty() && tempStack.peek() > currentElement) {
				stack.push(tempStack.pop());
			}
			tempStack.push(currentElement);
		}

		return tempStack;

	}

}
