package com.itacademy.jd1.part2.classwork.thread;

import com.itacademy.jd1.part2.classwork.thread.createv1.MyThread;
import com.itacademy.jd1.part2.classwork.thread.createv2.MyRunnable;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Main thread started");
		// approach 1
		MyThread myThread1 = new MyThread();
		myThread1.setName("Thread1_");
		myThread1.setPriority(10);
		myThread1.start();
		// approach 2
		Thread myThread2 = new Thread(new MyRunnable());
		myThread2.setPriority(1);
		myThread2.setName("Thread2_");
		myThread2.start();
		// approach 3
		final Thread myThread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started");
				System.out.println(Thread.currentThread().getName() + " ended");
			}
		});
		myThread3.setName("Thread3_");
		myThread3.start();

		System.out.println("Main thread ended");
	}

}
