package com.intexsoft.classwork.lection6;

public enum DayOfWeek {
	monday("��"), // name =monday ,index = 0
	tueday("��"), // name =tuesday ,index = 1
	wednesday("��"), thursday("��"), friday("��"), saturday("��"), sunday("��");

	private DayOfWeek(String titleRu) {
		this.titleRu = titleRu;
	}

	private String titleRu;

	public String getTitleRu() {
		return titleRu;
	}
}
