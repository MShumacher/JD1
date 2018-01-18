package com.itacademy.jd1.part1.classwork.bankomat;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Slot> slots = new ArrayList<Slot>();

		slots.add(new Slot(0, 20));
		slots.add(new Slot(5, 50));
		slots.add(new Slot(0, 100));

		ATM atm = new ATM(slots);
		atm.printCurrentSlots();
		int addNominal = 20;
		int addQuantity = 10;
		System.out.println(String.format("add money nominal = %s, quantity =  %s.",
				addNominal, addQuantity));
		atm.addMoney(addNominal, addQuantity);
		atm.printCurrentSlots();

		WithdrawResult result = atm.withdrawMoney(170);

		System.out.println(result);

		atm.printCurrentSlots();

	}

}
