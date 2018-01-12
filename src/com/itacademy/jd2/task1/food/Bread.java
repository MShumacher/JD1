package com.itacademy.jd2.task1.food;

import com.itacademy.jd2.task1.Food;

public class Bread extends Food {

	public Bread(String name, int price, int id) {
		super(name, price, id);
	}

	public Bread(BreadBase bread) {
		super(bread.name(), bread.getPrice(), bread.getId());
	}

}
