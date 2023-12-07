package com.sample;


import java.util.Scanner;


public class TestApp {
	static int count_2k;
	static int count_5h;
	static int count_1h;
	static int count_50;
	static int count_10;
	static int count_5;
	static int count_2;
	static int count_1;
	public static void calcluateNotes(int amount) {
		int balance=amount;
		if(balance==0)
			System.out.println("count_2k: "+ count_2k+" count_5h: " +count_5h+" count_1h: " +count_1h+
					" count_50: " +count_50+" count_10: " +count_10+" count_2: "+count_2+" count_1: "+count_1);
		else {
			if(balance%2000==0) {
				count_2k++;
				balance=balance-2000;
				calcluateNotes(balance);
			}
			else if(balance%500==0) {
				count_5h++;
				balance=balance-500;
				calcluateNotes(balance);
			}
			else if(balance%100==0) {
				count_1h++;
				balance=balance-100;
				calcluateNotes(balance);
			}
			else if(balance%50==0) {
				count_50++;
				balance=balance-50;
				calcluateNotes(balance);
			}
			else if(balance%10==0) {
				count_10++;
				balance=balance-10;
				calcluateNotes(balance);
			}
			else if(balance%5==0) {
				count_5++;
				balance=balance-5;
				calcluateNotes(balance);
			}
			else if(balance%2==0) {
				count_2++;
				balance=balance-2;
				calcluateNotes(balance);
			}
			else if(balance%1==0) {
				count_1++;
				balance=balance-1;
				calcluateNotes(balance);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nValue = scanner.nextInt();
		calcluateNotes(nValue);
		scanner.close();
		
	}
}
