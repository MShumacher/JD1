package com.itacademy.jd1.part2.task1.food;

public enum BreadBase{
	Dark(30001, 2), White(30002, 3), Pita(30003, 4), Baguette(30004, 3);
	private int id;
	private int price;

	private BreadBase(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public static BreadBase getRandomBread() {
		int rand = (int) (Math.random() * (BreadBase.values().length - 1));
		return BreadBase.values()[rand];
	}
}
