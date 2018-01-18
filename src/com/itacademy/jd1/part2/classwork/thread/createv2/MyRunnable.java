package com.itacademy.jd1.part2.classwork.thread.createv2;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
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
		System.out.println(name + " ended");
	}
}
