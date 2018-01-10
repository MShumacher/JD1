package com.itacademy.jd2.task1.food;

import com.itacademy.jd2.task1.Article;

public class Grape extends Article {

	public Grape(String name, int price, int id) {
		super(name, price, id);
	}

	public Grape(GrapeEnum grape) {
		super(grape.name(), grape.getPrice(), grape.getId());
	}

}
