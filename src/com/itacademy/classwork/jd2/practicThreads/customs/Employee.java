package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.LinkedList;

public abstract class Employee extends Thread {
	private LinkedList<Car> carQueue;
	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public Employee(LinkedList<Car> carQueue) {
		super();
		this.carQueue = carQueue;
		this.employeeName = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Start %s ", this.employeeName));
		this.start();
	}

	public LinkedList<Car> getCarQueue() {
		return carQueue;
	}

	public void goHome(String name) {
		System.out.println(String.format("%s go home.", name));
	}
}
