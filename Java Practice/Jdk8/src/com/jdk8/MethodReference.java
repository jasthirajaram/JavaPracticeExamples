// Program using method reference
package com.jdk8;
import java.util.function.*;  
class Arithmetic{  
	
public static float add(int a, float b){  
return a+b;  
}  
}  


public class MethodReference {  
public static void main(String[] args) {   
BiFunction<Integer, Float, Float>adder = Arithmetic::add;      
float result = adder.apply(10, 20.0f);   
System.out.println(result);    
} 
}