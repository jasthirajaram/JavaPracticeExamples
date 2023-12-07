package com.jdk8;

import java.util.stream.*;  
public class StreamInJava {  
    public static void main(String[] args){  
    	// iterating the starting with one and adding one to previous element
        Stream.iterate(1, element->element+1)
        //applying conditions that elements should be printed that which are divisible by 11
        .filter(element->element%11==0)  
        // giving the limit that only 5 elements should be printed
        .limit(5)  
        .forEach(System.out::println);  
    }  
}  