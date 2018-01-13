package com.itacademy.classwork.jd2.practicThreads.customsClass;

import java.util.Queue;

public class PLEmployee extends AbstractEmployee {

	private int carCounter;

	public PLEmployee(Queue<Car> queue) {
		super(queue);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				goHome();
				return;
			}
			if (Thread.interrupted()) {
				goHome();
				return;
			}
			handleCar();
		}
	}

	private void goHome() {
		System.out.println(String.format("%s пошел домой обработав %s машин", getEmployeeName(), getCarCounter()));
	}

	private void handleCar() {
		Car result = getQueue().poll();
		if (result != null) {
			carCounter++;
			System.out.println(String.format("%s забрал автомобиль из буффера. осталось:%s", getEmployeeName(),
					getQueue().size()));
		} else {
			System.out.println(String.format("%s Забирать нечего. осталось:%s", getEmployeeName(), getQueue().size()));
		}
	}

	public int getCarCounter() {
		return carCounter;
	}

}
