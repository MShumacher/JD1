package com.itacademy.jd2.task1.food;

public enum GrapeBase {
	RedGlobe(10001, 2), Sultana(10002, 3), Azalia(10003, 4), Izabella(10004, 2);
	private int id;
	private int price;

	private GrapeBase(int id, int price) {
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
