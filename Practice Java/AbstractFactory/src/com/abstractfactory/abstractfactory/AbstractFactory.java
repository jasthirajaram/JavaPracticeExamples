package com.abstractfactory.abstractfactory;

import com.abstractfactory.color.Color;
import com.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String colorType);
	public abstract Shape getShape(String shapeType);
}