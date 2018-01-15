package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.LinkedList;

public class PLEmployee extends Employee {

	public PLEmployee(LinkedList<Car> carQueue) {
		super(carQueue);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while (true) {
			try {
				Thread.sleep(15 * 1000);
			} catch (InterruptedException e) {
				goHome(name);
				return;
			}
			deleteCar(name);
		}
	}

	public void deleteCar(String name) {
		synchronized (getCarQueue()) {
			if (getCarQueue().isEmpty()) {
				System.out.println(String.format("PL %s: No cars in buffer.", name));
			} else {
				getCarQueue().removeFirst();
				System.out.println(String.format("PL %s: delete car. [%s]", name, getCarQueue().size()));
			}
		}
	}
}
