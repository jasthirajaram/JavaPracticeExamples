package com.abstractfactory.square;

import com.abstractfactory.shape.Shape;

public class Square implements Shape {

	@Override
	public void shape() {
		System.out.println("Square has four sides");
	}

}
