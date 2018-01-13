package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.List;

public abstract class Employee extends Thread {
	protected List<Car> carqueue;

	public Employee(List<Car> carqueue) {
		this.carqueue = carqueue;
		this.start();
	}
}
