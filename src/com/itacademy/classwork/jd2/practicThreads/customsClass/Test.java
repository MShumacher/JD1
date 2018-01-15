package com.itacademy.classwork.jd2.practicThreads.customsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		List<PLEmployee> plEmployees = new ArrayList<>();
		List<BYEmployee> byEmployees = new ArrayList<>();

		Queue<Car> queue = new ConcurrentLinkedQueue<Car>();

		byEmployees.add(new BYEmployee(queue));

		plEmployees.add(new PLEmployee(queue));
		plEmployees.add(new PLEmployee(queue));

		startWork(plEmployees);
		startWork(byEmployees);

		new BYBoss(queue, byEmployees).start();
		Thread.sleep(200);
		new PLBoss(queue, plEmployees).start();
	}

	private static void startWork(List<? extends Thread> workers) throws InterruptedException {
		for (Thread thread : workers) {
			thread.start();
			Thread.sleep(200);
		}
	}
}
