package com.itacademy.jd1.part1.classwork.lection6;

class Lection67 {
	public static void main(String[] args) {
		DayOfWeek wednesday = DayOfWeek.wednesday;
		String titleRu = wednesday.getTitleRu();

		System.out.println("Enum as String: " + wednesday.name());
		System.out.println("Enum as Number: " + wednesday.ordinal());

		DayOfWeek wednesdayFromString = DayOfWeek.valueOf("wednesday");
		DayOfWeek dayOfWeek = DayOfWeek.values()[2];
		System.out.println(wednesdayFromString);
		System.out.println(dayOfWeek);
	}
}
