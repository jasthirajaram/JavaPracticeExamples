package com.factory.bike;

import com.factory.vehicle.Vehicle;

public class Bike implements Vehicle {

	@Override
	public void feature() {
		System.out.println("Bike has two wheels.");
	}

}
