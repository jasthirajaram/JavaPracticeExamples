package com.factory.area;

public class ShapeFactoryMain {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shapeObj = shapeFactory.getInstance("areaofsquare");
		shapeObj.area();
	}
}
