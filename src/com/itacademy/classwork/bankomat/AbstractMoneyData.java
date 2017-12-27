package com.itacademy.classwork.bankomat;

public abstract class AbstractMoneyData {
	private int quantity;
	private int nominal;

	public AbstractMoneyData(int nominal, int quantity) {
		super();
		this.nominal = nominal;
		this.quantity = quantity;
	}

	public int getNominal() {
		return nominal;
	}

	public int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+"[ nominal:"+nominal+" ,quantity: "+quantity+" ]"));
	}
}
