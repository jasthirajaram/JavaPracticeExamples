package com.strings.demo;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 3999: ");
        int number = input.nextInt();

        if (number < 1 || number > 3999) {
            System.out.println("Invalid input.");
        }

        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String romanNumeral = "";
        int i = 0;

        while (number > 0) {
            int count = number / values[i];
            for (int j = 0; j < count; j++) {
                romanNumeral += romanNumerals[i];
                number -= values[i];
            }
            i++;
        }

        System.out.println("Roman numeral: " + romanNumeral);
        input.close();
    }
}
