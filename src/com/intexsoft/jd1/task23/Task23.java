package com.intexsoft.jd1.task23;

public class Task23 {
	public static void main(String[] args) {
		Bankomat bank1 = new Bankomat(10, 5, 15);
		bank1.addMoney(1, 1, 1);
		bank1.getStatus();
		bank1.getMoney(815);
	}
}
