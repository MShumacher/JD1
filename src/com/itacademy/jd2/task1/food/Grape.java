package com.itacademy.jd2.task1.food;

import com.itacademy.jd2.task1.Food;

public class Grape extends Food {

	public Grape(String name, int price, int id) {
		super(name, price, id);
	}

	public Grape(GrapeBase grape) {
		super(grape.name(), grape.getPrice(), grape.getId());
	}

}
