package com.stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {  
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ravikiran", "Divya", "Rajaram");
		List<String> list1 = list.stream().filter(t -> t.startsWith("R")).collect(Collectors.toList());
		list.stream().distinct().findAny();
	    System.out.println(list1); 
	}
}