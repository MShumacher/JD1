package com.itacademy.jd1.part2.task1;

import java.util.Map;
import java.util.TreeMap;

public abstract class Basket extends Thread {
	private Map<Article, Integer> shop;
	private String name;
	private Map<Article, Integer> desk = new TreeMap<Article, Integer>();

	public Basket(Map<Article, Integer> shop) {
		super();
		this.shop = shop;
		this.name = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Start %s ", this.name));
		this.start();
	}

	@Override
	public String toString() {
		return name;
	}

	public Map<Article, Integer> getDesk() {
		return desk;
	}

	public void setDesk(Map<Article, Integer> desk) {
		this.desk = desk;
	}

	public Article getRandomItemFromShop() {
		synchronized (shop) {
			int rand = (int) (Math.random() * shop.size());
			int i = 0;
			for (Article entry : shop.keySet()) {
				if (i == rand) {
					removeItem(entry, 1);
					return entry;
				} else {
					i++;
				}
			}
			return null;
		}
	}

	public void addArticle(Article article, Integer count) {
		if (desk.containsKey(article)) {
			desk.put(article, count + desk.get(article));
		} else {
			desk.put(article, count);
		}
	}

	public void removeItem(Article article, int count) {
		synchronized (shop) {
			if (shop.get(article) == 1) {
				shop.remove(article);
			} else {
				shop.put(article, shop.get(article) - count);
			}
		}
	}

	public void print() {
		System.out.println(String.format("------------------"));
		int count = 0;
		for (Map.Entry<Article, Integer> entry : desk.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			count += entry.getValue();
		}
		System.out.println(String.format("%s articles.", count));
		System.out.println("------------------");

	}

	public Map<Article, Integer> getShop() {
		return shop;
	}
}