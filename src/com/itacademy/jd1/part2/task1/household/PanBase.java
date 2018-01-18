package com.itacademy.jd1.part2.task1.household;

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

	public int getPrice() {
		return price;
	}

	public static PanBase getRandomPan() {
		int rand = (int) (Math.random() * (PanBase.values().length - 1));
		return PanBase.values()[rand];
	}
}
