package com.interfc.test;

public class ReverseEachWordInString {
	static void reverseString(String inputString) {

		String[] split = inputString.split(" ");
		String reverse = null;
		for (int i = 0; i < split.length; i++) {
			String word = split[i];
			String reverserWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverserWord = reverserWord + word.charAt(j);
			}

			reverse = reverse + reverserWord + " ";
		}
	}

	public static void main(String[] args) {
		reverseString("Am Not String");

		reverseString("JAVA JSP ANDROID");

		reverseString("1 22 333 4444 55555");
	}
}
