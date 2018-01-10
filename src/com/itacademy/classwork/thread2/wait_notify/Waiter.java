package com.itacademy.classwork.thread2.wait_notify;

public class Waiter implements Runnable {

	private final Message msg;// этот поток останавливаем

	public Waiter(final Message m) {
		this.msg = m;
	}

	@Override
	public void run() {
		final String name = Thread.currentThread().getName();
		synchronized (msg) {
			try {
				System.out.println(name + " ждем вызов метода notify: " + System.currentTimeMillis());
				msg.wait();// тут приостанавливаем текущий поток, пока его кто-то не разбудит
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " был вызов метода notify: " + System.currentTimeMillis());
			// обработаем наше сообщение
			System.out.println(name + " : " + msg.getMsg());
		}
	}
}