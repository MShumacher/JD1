package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Car> carQueue = new LinkedList<Car>();
		List<Employee> byEmployee = new LinkedList<Employee>();
		List<Employee> plEmployee = new LinkedList<Employee>();
		byEmployee.add(new BYEmployee(carQueue));
		plEmployee.add(new PLEmployee(carQueue));
		plEmployee.add(new PLEmployee(carQueue));

	}

}
