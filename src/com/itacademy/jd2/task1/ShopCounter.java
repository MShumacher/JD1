package com.itacademy.jd2.task1;

import java.util.Map;
import java.util.TreeMap;

public class ShopCounter {
	private Map<Article, Integer> desk = new TreeMap<Article, Integer>();

	public Map<Article, Integer> getDesk() {
		return desk;
	}

	public Article getRandomItem() {
		int rand = (int) (Math.random() * desk.size());
		int i = 0;
		for (Map.Entry<Article, Integer> entry : desk.entrySet()) {
			if (i == rand) {
				this.removeItem(entry.getKey(), 1);
				// desk.put(entry.getKey(), entry.getValue() - 1);
				return entry.getKey();
			} else {
				i++;
			}
		}
		return null;
	}

	public void setDesk(Map<Article, Integer> desk) {
		this.desk = desk;
	}

	public void addArticle(Article article, Integer count) {
		if (desk.containsKey(article)) {
			desk.put(article, count + desk.get(article));
		} else {
			desk.put(article, count);
		}
	}

	public void removeItem(Article article, int count) {
		if (desk.get(article) == 1) {
			desk.remove(article);
		} else {
			desk.put(article, desk.get(article) - count);
		}
	}

	public void print() {
		System.out.println(String.format("Content counter :"));
		for (Map.Entry entry : desk.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(String.format("Counter has %s articles.", desk.size()));
		System.out.println("------------------");

	}
}