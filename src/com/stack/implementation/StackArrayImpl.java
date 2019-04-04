package com.stack.implementation;

public class StackArrayImpl {
public static int size = 5;
public int stack[] = new int[size];
public int top = -1;

	public static void main(String[] args) {
		StackArrayImpl sai = new StackArrayImpl();
		System.out.println("Stack insert");
		sai.push(10);
		sai.push(20);
		sai.push(30);
		sai.push(40);
		sai.push(50);
		System.out.println("Stack remove");
		sai.pop();

	}

	public boolean isFull(){
		return (size - 1 == top);
	}
	
	public boolean isEmpty(){
		return (top == -1);
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
	
	public void  pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty and underflow");
		} else {
			int element = stack[top];
			System.out.println("removed data is "+element);
			top--;
		}
	}
	
}
