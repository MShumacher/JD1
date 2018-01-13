package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.List;

public class PLEmployee extends Employee {

	public PLEmployee(List<Car> carQueue) {
		super(carQueue);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(String.format("Start PLEmployee %s ", name));
		try {
			while (true) {
				deleteCar(name);
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void deleteCar(String name) {
		if (getCarQueue().isEmpty()) {
			System.out.println("No cars in buffer.");
		} else {
			getCarQueue().remove(0);
			System.out.println(String.format("PL %s delete car. [%s]", name, getCarQueue().size()));
		}
	}
}
