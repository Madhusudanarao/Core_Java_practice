package com.java8.practice;

interface Interf {
	public static void m1() {
		System.out.println("Main ");
	}
}

public class StaticTest implements Interf {
	public static void main(String[] args) {
		Interf.m1();
	}
}
