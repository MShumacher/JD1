package com.intexsoft.classwork.lection6;

public enum DayOfWeek {
	monday("пн"), // name =monday ,index = 0
	tueday("вт"), // name =tuesday ,index = 1
	wednesday("ср"), thursday("чт"), friday("пт"), saturday("сб"), sunday("вс");

	private DayOfWeek(String titleRu) {
		this.titleRu = titleRu;
	}

	private String titleRu;

	public String getTitleRu() {
		return titleRu;
	}
}
