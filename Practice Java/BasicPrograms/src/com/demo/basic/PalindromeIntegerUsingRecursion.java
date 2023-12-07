package com.demo.basic;

import java.util.Scanner;

public class PalindromeIntegerUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(int num) {
        int reverseNum = reverse(num, 0);
        return num == reverseNum;
    }

    public static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        } else {
            int digit = num % 10;
            int newRev = rev * 10 + digit;
            int remaining = num / 10;
            return reverse(remaining, newRev);
        }
    }
}

