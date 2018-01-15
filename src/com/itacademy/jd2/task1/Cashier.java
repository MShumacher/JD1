package com.itacademy.jd2.task1;

import java.util.LinkedList;
import java.util.Map.Entry;

public class Cashier extends Thread {
	private String name;
	private LinkedList<Shopper> queue;
	private Shopper currentShopper;

	public Cashier(LinkedList<Shopper> queue) {
		super();
		this.queue = queue;
		this.name = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Start %s ", this.name));
		this.start();
	}

	public void run() {
		while (true) {
			synchronized (queue) {
				if (queue.isEmpty()) {
					System.out.println(name + ": Queue is empty.");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				currentShopper = queue.getFirst();
				queue.removeFirst();
				System.out.println(
						String.format("Shopper %s go to %s. Queue: %s", currentShopper.getName(), name, queue));

			}
			int allArticleInBasket = 0;
			currentShopper.getDesk();
			for (Entry<Article, Integer> entry : currentShopper.getDesk().entrySet()) {
				allArticleInBasket += entry.getValue();
			}
			int serviceTime = 3 * 1000 + allArticleInBasket * 1000 + (int) (Math.random() * 3 * 1000);
			try {
				Thread.sleep(serviceTime);
				ShopperGoHome(serviceTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void ShopperGoHome(int serviceTime) {
		System.out.println(String.format("%s: service time [%s]. Shopper %s go home with:", name, serviceTime / 1000,
				currentShopper.getName()));
		currentShopper.print();
	}
}
