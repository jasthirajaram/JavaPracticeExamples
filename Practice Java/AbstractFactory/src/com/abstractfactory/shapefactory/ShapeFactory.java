package com.abstractfactory.shapefactory;

import com.abstractfactory.abstractfactory.AbstractFactory;
import com.abstractfactory.color.Color;
import com.abstractfactory.rectangle.Rectangle;
import com.abstractfactory.shape.Shape;
import com.abstractfactory.square.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String colortype) {
		return null;
	}
	
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		} else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else
			return null;
	}
}
