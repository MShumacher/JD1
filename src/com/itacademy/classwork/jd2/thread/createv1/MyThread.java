package com.itacademy.classwork.jd2.thread.createv1;

public class MyThread extends Thread {
	@Override
	public void run() {
		// String threadName = getName();
		// System.out.println(threadName + " started");

		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		int i = 0;
		while (i < 100) {
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + i);
		}
		// System.out.println(threadName + " ended");
		System.out.println(name + " ended");
	}
}
