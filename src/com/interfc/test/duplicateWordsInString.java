package com.interfc.test;

import java.util.HashMap;
import java.util.Set;

public class duplicateWordsInString {

	public static void main(String[] args) {

		duplicateWords("Bread butter and bread");

		duplicateWords("Java is java again java");

		duplicateWords("Super Man Bat Man Spider Man");

	}

	static HashMap<String, Integer> mapOfString = new HashMap<String, Integer>();

	private static void duplicateWords(String sentence) {

		String[] words = sentence.split(" ");
		for (String s1 : words) {
			if (mapOfString.containsKey(s1)) {
				mapOfString.put(s1, mapOfString.get(s1) + 1);
			} else {
				mapOfString.put(s1, 1);
			}

		}

		Set<String> wordsInString = mapOfString.keySet();

		for (String word : wordsInString) {
			if (mapOfString.get(word) > 1) {
				System.out.println(word + " : " + mapOfString.get(word));
			}
		}
	}
}
