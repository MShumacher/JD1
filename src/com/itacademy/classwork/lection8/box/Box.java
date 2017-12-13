package com.itacademy.classwork.lection8.box;

public class Box<TYPE1, TYPE2> {
	private TYPE1 item;
	private TYPE2 item2;

	public TYPE1 getItem() {
		return item;
	}

	public void setItem(TYPE1 item) {
		this.item = item;
	}

	public TYPE2 getItem2() {
		return item2;
	}

	public void setItem2(TYPE2 item2) {
		this.item2 = item2;
	}

}
