package com.itacademy.jd1.part2.classwork.practicThreads.horse;

public class Horse extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		int step = 0;
		int i = 0;
		System.out.println(String.format("Start %s ", name));
		while (step < 50) {
			step += 1 + (int) (Math.random() * 3);
			i++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// System.out.println(String.format("%s %s", name, finish));
		}
		System.out.println(String.format("%s finished. Time: %s", name, i));
	}
}
