package com.itacademy.jd2.task1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private List<ShopCounter> allCounter = new ArrayList<ShopCounter>();

	public void print() {
		for (ShopCounter shopCounter : allCounter) {
			shopCounter.print();
		}
	}

	public void addCounter(ShopCounter counter) {
		allCounter.add(counter);

	}
}
