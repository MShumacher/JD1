package com.itacademy.jd1.part1.classwork.lection7;

public class OverloadDemo {
	public void test(int a) {
		System.out.println("a= " + a);
	}

	public double test(double a) {
		System.out.println("a= " + a);
		return a * a;
	}
}
