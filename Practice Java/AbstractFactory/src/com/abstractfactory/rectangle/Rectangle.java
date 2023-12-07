package com.abstractfactory.rectangle;

import com.abstractfactory.shape.Shape;

public class Rectangle implements Shape {

	@Override
	public void shape() {
		System.out.println("Rectangle has length and breadth");
	}
	
}
