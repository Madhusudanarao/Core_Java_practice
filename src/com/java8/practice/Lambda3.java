package com.java8.practice;


interface Interf3{
	
	public void  add(int i,int j);
}

public class Lambda3 {
	public static void main(String[] args) {
		Interf3 i2 = (i,b)-> { System.out.println("sum of "+ (i+b));};
		i2.add(10, 20);
	}
}
