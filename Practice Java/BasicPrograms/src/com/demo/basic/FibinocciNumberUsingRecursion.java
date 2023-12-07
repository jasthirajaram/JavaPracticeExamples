package com.demo.basic;

import java.util.Scanner;

public class FibinocciNumberUsingRecursion {
    
    public static int fibinocci(int n) {
        if(n == 0 || n == 1) {
        	return n;
        }
        else {
        	return fibinocci(n - 1) + fibinocci(n - 2);
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the range");
        int n = sc.nextInt();
        System.out.print("Fibonacci series upto " + n + " terms: ");
        for(int i=0; i<n; i++) {
            System.out.print(fibinocci(i) + " ");
        }
        sc.close();
    }
}
