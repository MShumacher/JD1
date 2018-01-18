package com.itacademy.jd1.part1.classwork.bankomat;

public abstract class AbstractMoneyData {
	private int quantity;

	private int nominal;

	public AbstractMoneyData(int quantity, int nominal) {
		super();
		this.quantity = quantity;
		this.nominal = nominal;
	}

	public int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getNominal() {
		return nominal;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + " [quantity=" + quantity + ", nominal=" + nominal
				+ "] ";
	}

}
