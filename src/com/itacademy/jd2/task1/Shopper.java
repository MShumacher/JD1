package com.itacademy.jd2.task1;

import java.util.LinkedList;
import java.util.Map;

public class Shopper extends Basket {

	// private LinkedList<Shopper> shopper;
	private LinkedList<Shopper> queue;

	// public Shopper(Map<Article, Integer> shop, LinkedList<Shopper> shopper,
	// LinkedList<Shopper> queue) {
	public Shopper(Map<Article, Integer> shop, LinkedList<Shopper> queue) {
		super(shop);
		// this.shopper = shopper;
		this.queue = queue;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		int count = 5 + (int) (Math.random() * 5);
		int i = 0;
		while (i < count) {
			try {
				Thread.sleep(3 * 1000 + (int) (Math.random() * 3 * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (getShop().isEmpty()) {
				System.out.println(name + ": Shop is out.");
			} else {
				addArticle(getRandomItemFromShop(), 1);
				i++;
			}
		}
		synchronized (queue) {
			queue.add(this);
			System.out.println(String.format("Shopper %s came to queue. Queue[%s]: [%s]", name, queue.size(), queue));
			// System.out.println(getShop());
			// shopper.removeFirst();remove current
			queue.notify();
		}
	}
}
