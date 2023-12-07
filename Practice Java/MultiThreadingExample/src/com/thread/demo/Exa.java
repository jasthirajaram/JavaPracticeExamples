package com.thread.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("bhilash","Abhi","Ija"));
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
