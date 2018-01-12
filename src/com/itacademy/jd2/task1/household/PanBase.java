package com.itacademy.jd2.task1.household;

public enum PanBase {
	Big(70001, 50), Medium(70002, 30), Small(70003, 25);
	private int id;
	private int price;

	private PanBase(int id, int price) {
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
