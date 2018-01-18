package com.itacademy.jd1.part2.gasstation;

public enum Fuel {
	Premium("Аи-95"), Regular("Аи-92"), Diesel("ДТ");
	private String titleRu;

	public String getTitleRu() {
		return titleRu;
	}

	private Fuel(String titleRu) {
		this.titleRu = titleRu;
	}
}
