package com.abstractfactory.colorfactory;

import com.abstractfactory.abstractfactory.AbstractFactory;
import com.abstractfactory.blue.Blue;
import com.abstractfactory.color.Color;
import com.abstractfactory.green.Green;
import com.abstractfactory.red.Red;
import com.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		} else if (colorType.equalsIgnoreCase("red")) {
			return new Red();
		} else if (colorType.equalsIgnoreCase("blue")) {
			return new Blue();
		} else if (colorType.equalsIgnoreCase("green")) {
			return new Green();
		} else
			return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
