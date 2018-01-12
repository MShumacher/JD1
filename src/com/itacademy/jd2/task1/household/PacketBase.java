package com.itacademy.jd2.task1.household;

public enum PacketBase {
	Big(60001, 3), Middle(60002, 2), Small(60003, 1), Free(60004, 0);
	private int id;
	private int price;

	private PacketBase(int id, int price) {
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
