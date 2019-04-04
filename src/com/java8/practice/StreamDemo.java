package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		l1.add(30);
		/*ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(int i: l1){
			if(i%2==0){
				l2.add(i);
			}
		}*/
		List<Integer> l2 =  l1.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
