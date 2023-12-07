package com.abstractfactory.blue;

import com.abstractfactory.color.Color;

public class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("Filled with BLUE color");
	}
}
