package com.itacademy.jd1.part2.classwork.patterns.patternfactory;

public class Main {

	public static void main(String[] args) {
		Car car1 = CarFactory.buildCar(CarType.SMALL);
		Car car2 = CarFactory.buildCar(CarType.LUXURY);
		Car car3 = CarFactory.buildCar(CarType.SMALL);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}

}
