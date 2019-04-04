package com.interfc.test;

import java.util.TreeMap;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		String s = "Java is java again java again";
		char c = 'a';
		int count = s.length() - s.replace("a", "").length();
		System.out.println("Number of occurances of 'a' in " + s + " = " + count);
		TreeMap map = new TreeMap();
		 
	}
}
