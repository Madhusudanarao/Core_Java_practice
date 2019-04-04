package com.interfc.test;

public class ReversePreserveSpace {
	static void reverseString(String inputString) {
		char[] inputArray = inputString.toCharArray();
		char[] resultArray = new char[inputString.length()];

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}
		int j = inputArray.length - 1;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != ' ') {
				if (resultArray[j] == ' ') {
					j--;
				}
				resultArray[j] = inputArray[i];
				j--;
			}

		}
		System.out.println("after reverse " + String.valueOf(resultArray));
	}

	public static void main(String[] args) {
		reverseString("I Am Not String");

		reverseString("JAVA JSP ANDROID");

		reverseString("1 22 333 4444 55555");
	}

}
