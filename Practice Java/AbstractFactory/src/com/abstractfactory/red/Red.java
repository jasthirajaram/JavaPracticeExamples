package com.abstractfactory.red;

import com.abstractfactory.color.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Filled with RED color");
	}

}
