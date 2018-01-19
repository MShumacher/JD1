package com.itacademy.jd1.part2.classwork.patterns.patternfactory;

public class Car {
	private CarType model;

	public void Car(CarType model) {
		this.model = model;
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
}
