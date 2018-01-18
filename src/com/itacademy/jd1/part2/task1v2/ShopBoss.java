package com.itacademy.jd1.part2.task1v2;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.itacademy.jd1.part2.task1v2.Article;
import com.itacademy.jd1.part2.task1v2.Shopper;

public class ShopBoss extends Thread {
	private String name;
	private Map<Article, Integer> shop;
	private List<Cashier> cashier;
	private LinkedList<Shopper> queue;

	public ShopBoss(Map<Article, Integer> shop, List<Cashier> cashier, LinkedList<Shopper> queue) {
		super();
		this.name = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Start %s ", this.name));
		this.shop = shop;
		this.cashier = cashier;
		this.queue = queue;
		this.start();
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void run() {
		while (true) {
			if (cashier.size() < 100) {
				cashier.notify();
			}
			;
		}
	}

	public int getSizeShop() {
		synchronized (shop) {
			int count = 0;
			for (Map.Entry<Article, Integer> entry : shop.entrySet()) {
				count += entry.getValue();
			}
			return count;
		}
	}
}
