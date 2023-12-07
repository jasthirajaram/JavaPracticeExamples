package com.factory.vehiclemain;

import com.factory.vehicle.Vehicle;
import com.factory.vehiclefactory.VehicleFactory;

public class VehicleMain {
	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		Vehicle vehicle = factory.getInstance("three");
		vehicle.feature();
	}
}