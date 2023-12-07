package com.factory.vehiclefactory;

import com.factory.auto.Auto;
import com.factory.bike.Bike;
import com.factory.car.Car;
import com.factory.vehicle.Vehicle;

public class VehicleFactory {
	public Vehicle getInstance(String vehicle) {
		if (vehicle == null) {
			return null;
		} else if (vehicle.equalsIgnoreCase("Four")) {
			return new Car();
		} else if (vehicle.equalsIgnoreCase("Three")) {
			return new Auto();
		} else if (vehicle.equalsIgnoreCase("Two")) {
			return new Bike();
		} else {
			return null;
		}
	}
}
