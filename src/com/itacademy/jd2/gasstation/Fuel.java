package com.itacademy.jd2.gasstation;

public enum Fuel {
	Premium("Аи-95"), Regular("Аи-92"), Diesel("ДТ");
	private String titleRu;
	private int count;

	public String getTitleRu() {
		return titleRu;
	}

	private Fuel(String titleRu) {
		this.titleRu = titleRu;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
