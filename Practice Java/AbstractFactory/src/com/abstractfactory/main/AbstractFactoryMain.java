package com.abstractfactory.main;

import com.abstractfactory.abstractfactory.AbstractFactory;
import com.abstractfactory.color.Color;
import com.abstractfactory.factoryproducer.FactoryProducer;
import com.abstractfactory.shape.Shape;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		// get an object of shape square
		Shape shape = shapeFactory.getShape("square");
		// call shape method of Square class
		shape.shape();

		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color = colorFactory.getColor("red");
		color.fill();
	}
}