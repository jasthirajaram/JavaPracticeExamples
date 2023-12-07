package com.demo.basic;

public class RemoveWhiteSpacesInStringUsingRecursion {
	public static void main(String[] args) {
		String str = "Welcome to the world!";
		System.out.println("Original string: " + str);

		String trimmedStr = removeSpaces(str);

		System.out.println("String without spaces: " + trimmedStr);
	}

	public static String removeSpaces(String str) {
		if (str.length() == 0) {
			return "";
		}

		char firstChar = str.charAt(0);
		String remainingChars = str.substring(1);

		if (Character.isWhitespace(firstChar)) {
			return removeSpaces(remainingChars);
		} else {
			return firstChar + removeSpaces(remainingChars);
		}
	}
}
