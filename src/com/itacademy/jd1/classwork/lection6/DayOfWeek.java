package com.itacademy.jd1.classwork.lection6;

public enum DayOfWeek {
	monday("понедельник"), // name =monday ,index = 0
	tueday("вторник"), // name =tuesday ,index = 1
	wednesday("среда"), thursday("четверг"), friday("пятница"), saturday("суббота", false), sunday("воскресенье",
			false);// создаем новые объекты класса dayofweek. они все public static final

	private String titleRu;
	private boolean isWorkingDay;

	private DayOfWeek() {
		this(true);
	}

	private DayOfWeek(String titleRu) {
		this.titleRu = titleRu;
	}

	private DayOfWeek(boolean isWorkingday) {
		this.isWorkingDay = isWorkingday;
	}

	private DayOfWeek(String titleRu, boolean isWorkingday) {
		this.isWorkingDay = isWorkingday;
		this.titleRu = titleRu;
	}

	public String getTitleRu() {
		return titleRu;
	}
}
