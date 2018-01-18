package com.itacademy.jd2.classwork.practicThreads.customsClass;

import java.util.List;
import java.util.Queue;

public class PLBoss extends AbstractEmployee {

	private List<PLEmployee> employees;

	public PLBoss(Queue<Car> queue, List<PLEmployee> employees) {
		super(queue);
		this.employees = employees;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int size = getQueue().size();
			if (size > 5) {
				System.out.println(
						String.format("%s: слишком мало людей", getEmployeeName()));
				addEmployee();
			} else {
				System.out.println(String.format("%s: слишком много бездельников",
						getEmployeeName()));
				removeEmployee();
			}
		}
	}

	private void removeEmployee() {
		PLEmployee theOldest = null;
		for (PLEmployee thread : employees) {
			if (theOldest == null || theOldest.getCarCounter() < thread.getCarCounter()) {
				theOldest = thread;
			}
		}

		employees.remove(theOldest);
		theOldest.interrupt();
	}

	private void addEmployee() {
		PLEmployee e = new PLEmployee(getQueue());
		employees.add(e);
		e.start();

	}
}
