package com.java8.practice;

interface Interf2{
	
	public int squareInt(int i);
}

public class Lambda2 {

	public static void main(String[] args) {
		Interf2 i2 = (i)-> { return i*i;};
		int x = i2.squareInt(10);
		System.out.println(x);

	}

}
