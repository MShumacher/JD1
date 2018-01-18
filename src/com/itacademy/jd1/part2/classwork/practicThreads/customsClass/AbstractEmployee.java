package com.itacademy.jd1.part2.classwork.practicThreads.customsClass;

import java.util.Queue;
import java.util.Random;

public class AbstractEmployee extends Thread {

	private Queue<Car> queue;

	private String employeeName;

	public AbstractEmployee(Queue<Car> queue) {
		super();
		this.queue = queue;
		this.employeeName = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Создан " + employeeName));
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Queue<Car> getQueue() {
		return queue;
	}

	protected long getRandomDelaySeconds(int lowerBound, int upperBound) {
		Random r = new Random();
		return 1000 * (r.nextInt(upperBound - lowerBound) + lowerBound);
	}
}
