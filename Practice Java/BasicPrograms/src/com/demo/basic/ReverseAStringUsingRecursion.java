package com.demo.basic;

import java.util.Scanner;

public class ReverseAStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversedStr = reverse(str);

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}