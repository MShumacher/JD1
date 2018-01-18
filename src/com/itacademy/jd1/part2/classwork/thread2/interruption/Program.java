package com.itacademy.jd1.part2.classwork.thread2.interruption;

public class Program {

	public static void main(final String[] args) {
		final Incrementator incrementatorThread = new Incrementator();// это поток
		incrementatorThread.start();// запускаем

		for (int i = 1; i <= 3; i++) {// делаем 3 итерации
			try {
				Thread.sleep(i * 2 * 1000);// засыпаем на 2000, потом 4000, потом 6000
			} catch (final InterruptedException e) {
			}

			incrementatorThread.changeAction();// проснулся, меняем направление с ++ на --
		}

		// incrementatorThread.finish();
		incrementatorThread.interrupt(); // останавливаем поток, если он "спит", то мы его будим и он сбрасывается в
											// false после его прочтения.

	}
}
