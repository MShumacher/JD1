package com.itacademy.jd1.part1.task23;

public class Task23 {
	public static void main(String[] args) {
		Bankomat bank1 = new Bankomat(10, 5, 15);
		bank1.add100(1);
		bank1.add50(1);
		bank1.add20(1);
		bank1.addMoney(1, 10, 1);
		bank1.getStatus();
		bank1.getMoney(810);
	}
}