package com.itacademy.jd2.classwork.practicThreads.customs;

import java.util.LinkedList;

public class Boss extends Employee {
	private LinkedList<Employee> employees;

	public LinkedList<Employee> getEmployees() {
		return employees;
	}

	public Boss(LinkedList<Employee> employees, LinkedList<Car> carQueue) {
		super(carQueue);
		this.employees = employees;
	}

	public void deleteEmployee(LinkedList<Employee> employee) {
		if (employee.size() == 1) {
			System.out.println("Last Employee. Can't remove.");
		} else {
			Employee first = employee.getFirst();
			employee.removeFirst();
			System.out.println(first.getEmployeeName() + " was removed.");
			first.interrupt();

		}

	}
}
