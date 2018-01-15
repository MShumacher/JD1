package com.itacademy.jd2.task1v2;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		Map<Article, Integer> shop = new TreeMap<Article, Integer>();
		List<Shopper> shopper = new LinkedList<Shopper>();
		LinkedList<Shopper> queue = new LinkedList<Shopper>();
		List<Cashier> cashier = new LinkedList<Cashier>();
		Delivery delivery = new Delivery(shop);
		for (int i = 0; i < 7; i++) {
			cashier.add(new Cashier(queue));
		}
		while (true) {
			int rand = 2 + (int) (Math.random() * 5);
			for (int i = 0; i < rand; i++) {
				// shopper.add(new Shopper(shop, shopper, queue));
				shopper.add(new Shopper(shop, queue));
			}
			Thread.sleep(5 * 1000 + (int) (Math.random() * 5 * 1000));
		}
	}

}
