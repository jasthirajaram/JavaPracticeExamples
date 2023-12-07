package com.abstractfactory.factoryproducer;

import com.abstractfactory.abstractfactory.AbstractFactory;
import com.abstractfactory.colorfactory.ColorFactory;
import com.abstractfactory.shapefactory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice == null) {
			return null;
		} else if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		} else
			return null;
	}
}
