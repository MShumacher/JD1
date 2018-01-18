package com.itacademy.jd2.classwork.practicThreads.customs;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Car> carQueue = new LinkedList<Car>();
		LinkedList<Employee> byEmployee = new LinkedList<Employee>();
		LinkedList<Employee> plEmployee = new LinkedList<Employee>();
		byEmployee.add(new BYEmployee(carQueue));
		plEmployee.add(new PLEmployee(carQueue));
		plEmployee.add(new PLEmployee(carQueue));
		new BYBoss(byEmployee, carQueue);
		new PLBoss(plEmployee, carQueue);

	}

}
