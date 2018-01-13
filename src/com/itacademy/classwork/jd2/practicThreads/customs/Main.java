package com.itacademy.classwork.jd2.practicThreads.customs;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Car> carqueue = new LinkedList<Car>();
		List<Employee> byemployee = new LinkedList<Employee>();
		List<Employee> plemployee = new LinkedList<Employee>();
		byemployee.add(new BYEmployee(carqueue));
		plemployee.add(new PLEmployee(carqueue));
		plemployee.add(new PLEmployee(carqueue));

	}

}
