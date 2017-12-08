package com.intexsoft.classwork.lection7;

public class Lection72 {

	public static void main(String[] args) {
		// Car car1 = new Car();
		// car1.move();
		OverloadDemo over1 = new OverloadDemo();

		Integer i = new Integer(5);
		over1.test(i);
		double dd = over1.test(4d);
		System.out.println(dd);

	}

}
