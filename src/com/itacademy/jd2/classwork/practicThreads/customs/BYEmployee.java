package com.itacademy.jd2.classwork.practicThreads.customs;

import java.util.LinkedList;

public class BYEmployee extends Employee {

	public BYEmployee(LinkedList<Car> carQueue) {
		super(carQueue);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while (true) {
			try {
				Thread.sleep(10 * 1000 + (int) (Math.random() * 10 * 1000));
			} catch (InterruptedException e) {
				goHome(name);
				return;
			}

			addCar(name);
		}
	}

	public void addCar(String name) {
		synchronized (getCarQueue()) {
			getCarQueue().add(new Car());
			System.out.println(String.format("BY %s: add car. [%s]", name, getCarQueue().size()));
		}
	}
}
