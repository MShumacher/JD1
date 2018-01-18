package com.itacademy.jd1.part2.classwork.thread2.wait_notify;

public class WaitNotifyTest {

	public static void main(final String[] args) {
		final Message msg = new Message("обработать");// создаем объект "пульт" для управления потоками
		final Waiter waiter1 = new Waiter(msg);// создаем 1й поток
		new Thread(waiter1, "waiter1").start();

		final Waiter waiter2 = new Waiter(msg);// создаем 2й поток
		new Thread(waiter2, "waiter2").start();

		final Notifier notifier = new Notifier(msg);// поток, который будит один из 2х предыдущих потоков, который
													// раньше заснул
		new Thread(notifier, "notifier").start();
		System.out.println("Стартовали все потоки");
	}

}