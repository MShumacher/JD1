package com.itacademy.jd1.part2.classwork.patterns.patternfactory;

public class CarFactory {

	public static Car buildCar(CarType model) {
		if (model == CarType.SMALL) {
			return new SmallCar();
		} else if (model == CarType.LUXURY) {
			return new LuxuryCar();
		} else if (model == CarType.SEDAN) {
			return new SedanCar();
		}
		throw new IllegalArgumentException("Not Supported CarType " + model);
	}
}