package com.itacademy.classwork.jd2.practicThreads.customsClass;

import java.util.List;
import java.util.Queue;

public class BYBoss extends AbstractEmployee {

	private List<BYEmployee> employees;

	public BYBoss(Queue<Car> queue, List<BYEmployee> employees) {
		super(queue);
		this.employees = employees;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(30 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int size = getQueue().size();
			if (size < 3) {
				System.out.println(String.format("%s: слишком мало людей", getEmployeeName()));
				addEmployee();
			} else if (size > 8) {
				System.out.println(String.format("%s: слишком много бездельников", getEmployeeName()));
				removeEmployee();
			}else {
				System.out.println(String.format("%s: продолжаем в том же режиме", getEmployeeName()));
			}

		}
	}

	private void removeEmployee() {
		BYEmployee theOldest = null;
		for (BYEmployee thread : employees) {
			if (theOldest == null || theOldest.getCarCounter() < thread.getCarCounter()) {
				theOldest = thread;
			}
		}
		
		employees.remove(theOldest);
		theOldest.interrupt();
	}

	private void addEmployee() {
		BYEmployee e = new BYEmployee(getQueue());
		employees.add(e);
		e.start();

	}
}
