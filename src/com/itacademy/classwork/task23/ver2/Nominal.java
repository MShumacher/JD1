package com.itacademy.classwork.task23.ver2;

public class Nominal {
	public Nominal(int nominal, int count) {
		this.nominal = nominal;
		this.number = count;
	}

	private int nominal;
	private int number;

	public int getNominal() {
		return nominal;
	}

	public void setNominal(int nominal) {
		this.nominal = nominal;
	}

	public int getCount() {
		return number;
	}

	public void setCount(int number) {
		this.number = number;
	}

}
