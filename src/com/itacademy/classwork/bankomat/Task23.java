package com.itacademy.classwork.bankomat;

import java.util.ArrayList;
import java.util.List;

public class Task23 {

	public static void main(String[] args) {
		List<Slot> slots = new ArrayList<Slot>();
		slots.add(new Slot(0,20));
		slots.add(new Slot(0,50));
		slots.add(new Slot(0,100));
		
		
		ATM atm= new ATM(slots);
		atm.printCurrentSlots();
		int addNominal=20;
		int addQuantity = 111;
		System.out.println(String.format("add money nominal = %s, quantity = %s",addNominal, addQuantity));
		atm.addMoney(addNominal, addQuantity);
WithdrawResult atm.withdrawMoney(130);
	}

}
