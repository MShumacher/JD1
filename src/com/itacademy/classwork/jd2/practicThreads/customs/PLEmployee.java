package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.List;

public class PLEmployee extends Employee {

	public PLEmployee(List<Car> carqueue) {
		super(carqueue);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(String.format("Start PLEmployee %s ", name));
		try {
			while (true) {
				deleteCar(name);
				Thread.sleep(15000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void deleteCar(String name) {
		if (carqueue.isEmpty()) {
			System.out.println("No cars in buffer.");
		} else {
			carqueue.remove(0);
			System.out.println(String.format("PL %s delete car. [%s]", name, carqueue.size()));
		}
	}
}
