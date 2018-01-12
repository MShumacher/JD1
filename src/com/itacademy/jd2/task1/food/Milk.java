package com.itacademy.jd2.task1.food;

import com.itacademy.jd2.task1.Food;

public class Milk extends Food {

	public Milk(String name, int price, int id) {
		super(name, price, id);
	}

	public Milk(MilkBase milk) {
		super(milk.name(), milk.getPrice(), milk.getId());
	}

}
