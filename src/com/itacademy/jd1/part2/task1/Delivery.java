package com.itacademy.jd1.part2.task1;

import java.util.Map;
import java.util.Map.Entry;

public class Delivery extends Basket {

	public Delivery(Map<Article, Integer> shop) {
		super(shop);
	}

	@Override
	public void run() {
		while (true) {
			int allArticleInShop = 0;
			for (Entry<Article, Integer> entry : getShop().entrySet()) {
				allArticleInShop += entry.getValue();
			}
			if (allArticleInShop > 500) {
				System.out.println("Don't need delivery." + allArticleInShop);
			} else {
				newDelivery(150 + (int) (Math.random() * 150));
			}
			try {
				Thread.sleep(30 * 1000 + (int) (Math.random() * 60 * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void newDelivery(int item) {
		System.out.println(String.format("New delivery: %s items. [%s]", item, this.getSizeShop() + item));
		for (int i = 0; i < item; i++) {
			Article randomArticle = new Article().getRandomArticle();
			if (getShop().containsKey(randomArticle)) {
				getShop().put(randomArticle, getShop().get(randomArticle) + 1);
			} else {
				getShop().put(randomArticle, 1);
			}
		}
		// for (Map.Entry<Article, Integer> entry : getShop().entrySet()) {
		// System.out.println(entry);
		// }
	}

	public int getSizeShop() {
		synchronized (getShop()) {
			int count = 0;
			for (Map.Entry<Article, Integer> entry : getShop().entrySet()) {
				count += entry.getValue();
			}
			return count;
		}
	}
}
