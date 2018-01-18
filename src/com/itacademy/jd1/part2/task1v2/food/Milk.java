package com.itacademy.jd1.part2.task1v2.food;

import com.itacademy.jd1.part2.task1v2.Article;

public class Milk extends Article {

	public Milk() {
		MilkBase milk = MilkBase.getRandomMilk();
		this.setName(milk.name());
		this.setPrice(milk.getPrice());
		this.setId(milk.getId());
	}

}
