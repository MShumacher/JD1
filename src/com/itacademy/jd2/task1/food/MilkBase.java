package com.itacademy.jd2.task1.food;

public enum MilkBase {
	MolMir(50001, 2), Bellakt(50002, 3), Milida(50003, 4);
	private int id;
	private int price;

	private MilkBase(int id, int price) {
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