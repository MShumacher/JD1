package com.itacademy.jd1.classwork.lection7;

public class Lection73 {

	public static void main(String[] args) {
		PassengerCar passengerCar = new PassengerCar();
		Truck truck = new Truck();
		startTheCar(truck);
		startTheCar(passengerCar);
	}

	private static void startTheCar(PassengerCar passengerCar) {
		passengerCar.move();
	}

	private static void startTheCar(Truck truck) {
		truck.move();

	}

	// ����� ���������� ������, ���� ����� � ����, ���� ������������ �� ������� ����
	// private static void startTheCar(�ar �ar) {
	// �ar.move();
	// }

}
