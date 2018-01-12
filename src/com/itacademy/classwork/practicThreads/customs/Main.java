package com.itacademy.classwork.practicThreads.customs;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// while (true) {
		final Counter counter = new Counter();
		for (int i = 0; i < 3; i++) {

			BYEmploye byemploye = new BYEmploye(counter);
			byemploye.setName("byemploye" + i);
			byemploye.start();

		}
	}

}
