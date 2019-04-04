package com.java8.practice;

interface Interf1{
	
	public void m1();
}

public class Lambda1 {
	
	public static void main(String[] args) {
		//(i) -> {return i*i}
		Interf1 i1 = ()-> System.out.println("Lambda");
		i1.m1();
	}

}
