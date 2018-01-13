package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.List;

public abstract class Employee extends Thread {
	private List<Car> carQueue;

	public Employee(List<Car> carQueue) {
		this.carQueue = carQueue;
		this.start();
	}

	public List<Car> getCarQueue() {
		return carQueue;
	}
}
