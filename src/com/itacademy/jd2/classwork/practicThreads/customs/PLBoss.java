package com.itacademy.jd2.classwork.practicThreads.customs;

import java.util.LinkedList;
import java.util.List;

public class PLBoss extends Boss {

	public PLBoss(LinkedList<Employee> plEmployee, LinkedList<Car> carQueue) {
		super(plEmployee, carQueue);
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(120 * 1000);
				System.out.print("PlBoss here. ");
				if (getCarQueue().size() <= 5) {
					deleteEmployee(getEmployees());
				} else {
					addEmployee(getEmployees());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void addEmployee(List<Employee> employee) {
		employee.add(new PLEmployee(getCarQueue()));
	}
}
