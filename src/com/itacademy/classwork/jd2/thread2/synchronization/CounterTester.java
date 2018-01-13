package com.itacademy.classwork.jd2.thread2.synchronization;

import java.util.concurrent.atomic.AtomicLong;

public class CounterTester {
	public static void main(final String[] args) throws InterruptedException {
		final Counter counter = new Counter();// объект счетчик
		for (int i = 0; i < 200; i++) {// создаем 200 потоков, который делает 1000 ++
			final CounterThread ct = new CounterThread(counter);
			ct.start();
		}
		Thread.sleep(500);// ждем пока все отработает

		System.out.println("Counter: " + counter.getCounter());
		// почему не 200 000???
	}
}

class Counter {// счетчик
	// private long counter = 0L;
	// 0,5 вариант private volatile long counter = 0L;// пишем volatile, чтобы
	// отключить
	// локальный кеш для переменной в каждом потоке
	// 1 вариант private AtomicLong counter = new AtomicLong(0);
	private long counter = 0L;

	// public void increaseCounter() {
	public synchronized void increaseCounter() {// 2й вариант делаем синхронизацию
		counter++;// можно писать synchronized (this){ counter++;}
		// 1 вариант counter.getAndIncrement();
	}

	public long getCounter() {
		return counter;
		// 1 вариант return counter.get();
	}
}

class CounterThread extends Thread {// класс-поток
	private final Counter counter;

	public CounterThread(final Counter counter) {
		this.counter = counter;// передаем ему counter
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increaseCounter();// при вызове 1000 раз увеличваем счетчтк на 1
		}
		System.out.println(Thread.currentThread().getName() + "-completed");
	}
}