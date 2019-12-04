package com.class29;

public class VehicleTest {

	public static void main(String[] args) {
		Car car = new BMW();
		car.drive();
		car.speed();
		car.start();
		car.stop();
		car.breaking();
		
		
		Vehicle vehicle = new BMW();
		vehicle.drive();
		vehicle.start();
		vehicle.stop();
		vehicle.speed();

	}

}
