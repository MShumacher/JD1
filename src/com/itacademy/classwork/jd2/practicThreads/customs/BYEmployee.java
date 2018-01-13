package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.List;

public class BYEmployee extends Employee {

	public BYEmployee(List<Car> carQueue) {
		super(carQueue);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(String.format("Start BYEmployee %s ", name));
		try {
			while (true) {
				addCar(name);
				Thread.sleep(1000 + (int) (Math.random() * 1000));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void addCar(String name) {
		getCarQueue().add(new Car());
		System.out.println(String.format("BY %s add car. [%s]", name, getCarQueue().size()));
	}
}
