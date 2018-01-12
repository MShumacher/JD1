package com.itacademy.classwork.practicThreads.customs;

public class BYEmploye extends Thread {
	private final Counter counter;

	public BYEmploye(final Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(String.format("Start %s ", name));
		try {
			while (true) {
				counter.addCar(counter.getQueue().size());
				counter.print();
				Thread.sleep(10000 + (int) (Math.random() * 10000));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
