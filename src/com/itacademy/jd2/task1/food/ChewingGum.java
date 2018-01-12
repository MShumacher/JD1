package com.itacademy.jd2.task1.food;

import com.itacademy.jd2.task1.Food;

public class ChewingGum extends Food {

	public ChewingGum(String name, int price, int id) {
		super(name, price, id);
	}

	public ChewingGum(ChewingGumBase chewingGum) {
		super(chewingGum.name(), chewingGum.getPrice(), chewingGum.getId());
	}

}
