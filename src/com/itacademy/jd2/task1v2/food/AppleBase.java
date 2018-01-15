package com.itacademy.jd2.task1v2.food;

public enum AppleBase {
	Jonagored(20001, 2), RedPrince(20002, 3), Golden(20003, 4);
	private int id;
	private int price;

	private AppleBase(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public static AppleBase getRandomApple() {
		int rand = (int) (Math.random() * (AppleBase.values().length - 1));
		return AppleBase.values()[rand];
	}

}
