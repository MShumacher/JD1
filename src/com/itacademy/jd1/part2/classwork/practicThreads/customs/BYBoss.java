package com.itacademy.jd1.part2.classwork.practicThreads.customs;

import java.util.LinkedList;

public class BYBoss extends Boss {

	public BYBoss(LinkedList<Employee> byEmployee, LinkedList<Car> carQueue) {
		super(byEmployee, carQueue);
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(60 * 1000);
				System.out.print("BYBoss here. ");
				if (getCarQueue().size() < 3) {
					addEmployee(getEmployees());
				} else if (getCarQueue().size() > 8) {
					deleteEmployee(getEmployees());
				} else {
					System.out.println("Don't need ByEmployees.");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void addEmployee(LinkedList<Employee> employee) {
		employee.add(new BYEmployee(getCarQueue()));
	}

}
