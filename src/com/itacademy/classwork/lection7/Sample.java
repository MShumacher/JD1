package com.itacademy.classwork.lection7;

public class Sample {
	private int objectId;
	static {
		System.out.println("init static block 1 of object ");
	}

	public Sample(int i) {
		super();
		objectId = i;
		System.out.println("Constructor: " + i);
	}

	{
		System.out.println("init block 2 of object " + objectId);
	}
}
