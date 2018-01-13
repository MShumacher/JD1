package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.List;

public class BYEmployee extends Employee {

	public BYEmployee(List<Car> carqueue) {
		super(carqueue);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(String.format("Start BYEmployee %s ", name));
		try {
			while (true) {
				addCar(name);
				Thread.sleep(10000 + (int) (Math.random() * 10000));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void addCar(String name) {
		carqueue.add(new Car());
		System.out.println(String.format("BY %s add car. [%s]", name, carqueue.size()));
	}
}
