package com.itacademy.jd2.task1.food;

public enum ChewingGumBase {
	Orbit(40001, 2), Dirol(40002, 3), HubbaBubba(40003, 4), JuicyFruit(40004, 3);
	private int id;
	private int price;

	private ChewingGumBase(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
