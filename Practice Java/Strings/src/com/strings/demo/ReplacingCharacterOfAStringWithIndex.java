package com.strings.demo;
import java.util.Scanner;

public class ReplacingCharacterOfAStringWithIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        String outputString = replaceCharacter(inputString, inputChar);

        System.out.println("Output: " + outputString);
    }

    public static String replaceCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ch) {
                sb.append(i + 1);
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
