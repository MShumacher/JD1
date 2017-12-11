package com.itacademy.jd1.task22;

public class Task22 {

	public static void main(String[] args) {
		TimeInterval t1 = new TimeInterval(125);
		TimeInterval t2 = new TimeInterval(125, 154, 14);
		System.out.println(t2.compareTime(t1));
		t2.printTimeInSecond();
		t1.printTime();
	}

}
