package com.java8.practice;

interface interf4 {
	public void add(int a, int b);
}

public class MethodReference {

	public  void sum(int a,int b){
		System.out.println(a + b);
	}
	public static void main(String[] args) {

		interf4 i = (a, b) -> {
			System.out.println(a + b);
		};
		i.add(10, 20);
		
		//interf4 i1 = MethodReference::sum;
		MethodReference  m1 = new MethodReference();
		interf4 i1 = m1::sum;
		i1.add(100, 200);
	}

}
