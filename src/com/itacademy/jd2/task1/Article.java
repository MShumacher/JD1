package com.itacademy.jd2.task1;

import com.itacademy.jd2.task1.food.Apple;
import com.itacademy.jd2.task1.food.Bread;
import com.itacademy.jd2.task1.food.ChewingGum;
import com.itacademy.jd2.task1.food.Grape;
import com.itacademy.jd2.task1.food.Milk;
import com.itacademy.jd2.task1.household.Packet;
import com.itacademy.jd2.task1.household.Pan;

public class Article implements Comparable<Article> {
	private String name;
	private Integer id;
	private int price;

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public int compareTo(Article article) {
		return this.id.compareTo(article.id);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [ " + name + " , " + id + " , " + price + " ]";
	}

	public Article getRandomArticle() {
		int rand = 1 + (int) (Math.random() * 7);
		switch (rand) {
		case 1:
			return new Apple();
		case 2:
			return new Bread();
		case 3:
			return new ChewingGum();
		case 4:
			return new Grape();
		case 5:
			return new Milk();
		case 6:
			return new Packet();
		case 7:
			return new Pan();
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
