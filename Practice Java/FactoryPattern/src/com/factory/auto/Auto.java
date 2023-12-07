package com.factory.auto;

import com.factory.vehicle.Vehicle;

public class Auto implements Vehicle {

	@Override
	public void feature() {
		System.out.println("Auto has three wheels.");
	}

}
