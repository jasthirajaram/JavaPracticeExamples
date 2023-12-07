package com.factory.car;

import com.factory.vehicle.Vehicle;

public class Car implements Vehicle {

	@Override
	public void feature() {
		System.out.println("Car has four wheels.");;
	}

}
