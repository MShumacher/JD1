package com.itacademy.classwork.jd2.thread2.wait_notify;

public class Notifier implements Runnable {

	private final Message msg;// этим потоком будим

	public Notifier(final Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		final String name = Thread.currentThread().getName();
		System.out.println(name + " стартовал");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name + " поток Notifier отработал");
				msg.notify();// останавливаем поток, который стоит
				// msg.notifyAll(); останавливаем все потоки, которые стоят
			}
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
}