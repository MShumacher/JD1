package com.itacademy.jd1.part1.classwork.lection7;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		System.out.println("create point" + x + "|" + y);
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this(x, 0);
	}

	public Point() {
		this(0, 0);
	}

	public void drawPoint() {
		System.out.println("bold point: " + x + "|" + y);
	}

}
