package com.itacademy.jd2.classwork.practicThreads.customsClass;

import java.util.Queue;

public class BYEmployee extends AbstractEmployee {

	private int carCounter;

	public BYEmployee(Queue<Car> queue) {
		super(queue);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(getRandomDelaySeconds(10, 20));
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
		System.out.println(String.format("%s пошел домой обработав %s машин",
				getEmployeeName(), getCarCounter()));
	}

	private void handleCar() {
		getQueue().add(new Car());
		carCounter++;
		System.out.println(String.format("%s добавил автомобиль в буффер. осталось:%s",
				getEmployeeName(), getQueue().size()));
	}

	public int getCarCounter() {
		return carCounter;
	}


}
