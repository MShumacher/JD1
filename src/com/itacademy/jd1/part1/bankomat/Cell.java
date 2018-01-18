package com.itacademy.jd1.part1.bankomat;

public class Cell {
	private int nominal;
	private int quantity;

	public Cell(int nominal, int quantity) {
		this.nominal = nominal;
		this.quantity = quantity;
	}

	public int getNominal() {
		return nominal;
	}

	public void setNominal(int nominal) {
		this.nominal = nominal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean available(int nominal) {
		if (this.nominal == nominal) {
			return true;
		} else {
			return false;
		}
	}
}
