package com.sample;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class TestApp2 {
	 static HashMap<String,Integer> map = new HashMap<>();
	 static int balance;
	public static void calculateNotes(HashMap<String,Integer> map,int amount) {
		balance=amount;
	if(balance==0) {
		Set<String> set = map.keySet();
		for(String s:set) {
			System.out.print(s+"   ");
			if(map.get(s)==null) {
				map.put(s, 0);
			}
			System.out.println(map.get(s));
			System.out.println();
		}
	}
	else if(balance%2000==0) {
		if(map.get("count_2k")==null) {
			map.put("count_2k", 1);
		}else {
			map.put("count_2k", map.get("count_2k")+1);
		}
		balance=balance-2000;
		calculateNotes(map, balance);
	}
	else if(balance%500==0) {
		if(map.get("count_5h")==null) {
			map.put("count_5h", 1);
		}else {
			map.put("count_5h", map.get("count_5h")+1);
		}
		balance=balance-500;
		calculateNotes(map, balance);
	}
	else if(balance%100==0) {
		if(map.get("count_1h")==null) {
			map.put("count_1h", 1);
		}else {
			map.put("count_1h", map.get("count_1h")+1);
		}
		balance=balance-100;
		calculateNotes(map, balance);
	}
	else if(balance%50==0) {
		if(map.get("count_50")==null) {
			map.put("count_50", 1);
		}else {
			map.put("count_50", map.get("count_50")+1);
		}
		balance=balance-50;
		calculateNotes(map, balance);
	}
	else if(balance%10==0) {
		if(map.get("count_10")==null) {
			map.put("count_10", 1);
		}else {
			map.put("count_10", map.get("count_10")+1);
		}
		balance=balance-10;
		calculateNotes(map, balance);
	}
	else if(balance%5==0) {
		if(map.get("count_5")==null) {
			map.put("count_5", 1);
		}else {
			map.put("count_5", map.get("count_5")+1);
		}
		balance=balance-5;
		calculateNotes(map, balance);
	}
	else if(balance%2==0) {
		if(map.get("count_2")==null) {
			map.put("count_2", 1);
		}else {
			map.put("count_2", map.get("count_2")+1);
		}
		balance=balance-2;
		calculateNotes(map, balance);
	}
	else if(balance%1==0) {
		if(map.get("count_1")==null) {
			map.put("count_1", 1);
		}else {
			map.put("count_1", map.get("count_1")+1);
		}
		balance=balance-1;
		calculateNotes(map, balance);
	}
	}

}
