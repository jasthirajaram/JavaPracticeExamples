package com.factory.area;

public class ShapeFactory {
	public Shape getInstance(String data) {
		if (data == null) {
			return null;
		} else if (data.equalsIgnoreCase("areaofrectangle")) {
			return new AreaOfRectangle();
		} else if (data.equalsIgnoreCase("areaofsquare")) {
			return new AreaOfSquare();
		} else if (data.equalsIgnoreCase("areaoftriangle")) {
			return new AreaOfTriangle();
		} else
			return null;
	}
}
