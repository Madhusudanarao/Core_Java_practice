package com.java8.practice;

interface inerf5 {
	public Sample get();

}

class Sample {
	Sample() {
		System.out.println("default Constructor");
	}

	Sample(String name) {
		System.out.println("Param Constructor");
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		inerf5 i = Sample::new;
		i.get();
		Sample s1 = i.get();
	}

}
