package com.abstractfactory.green;

import com.abstractfactory.color.Color;

public class Green implements Color {
	@Override
	public void fill() {
		System.out.println("Filled with GREEN color");
	}
}