package com.itacademy.jd1.part2.task1v2.food;

import com.itacademy.jd1.part2.task1v2.Article;

public class Bread extends Article {

	public Bread() {
		BreadBase bread = BreadBase.getRandomBread();
		this.setName(bread.name());
		this.setPrice(bread.getPrice());
		this.setId(bread.getId());
	}

}
