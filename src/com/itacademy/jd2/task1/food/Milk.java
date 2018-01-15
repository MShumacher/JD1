package com.itacademy.jd2.task1.food;

import com.itacademy.jd2.task1.Article;

public class Milk extends Article {

	public Milk() {
		MilkBase milk = MilkBase.getRandomMilk();
		this.setName(milk.name());
		this.setPrice(milk.getPrice());
		this.setId(milk.getId());
	}

}
