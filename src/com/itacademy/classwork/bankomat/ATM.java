package com.itacademy.classwork.bankomat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ATM {
	private List<Slot> slots;

	public ATM(List<Slot> slots) {
		super();
		this.slots = slots;
		// сортируем слоты по убыванию
		Collections.sort(this.slots, new Comparator<Slot>() {
			@Override
			// компаратор - это стандартный интерфейс для сортировки коллекции
			public int compare(Slot o1, Slot o2) {
				return o2.getNominal() - o1.getNominal();
			}
		});
	}

	public void addMoney(int nominal, int quantity) {
		for (Slot slot : slots) {
			if (slot.isApplicable(nominal)) {
				slot.add(quantity);
				return;
			}
		}
		throw new RuntimeException("not supportted nominal");
	}

	
	public WithdrawResult withdrawMoney(int requiredSum) {
		String message = "success";
		List<WithdrawResultItem> items = new ArrayList<>();
for (Slot slot : slots) {
	WithdrawResultItem resItem =slot.withdraw(requiredSum);
}
		return new WithdrawResult(message, items);
	}

	public void printCurrentSlots() {
		System.out.print("current slots:");
		for (Slot slot : slots) {
			System.out.print(slot.toString());
		}
		System.out.println();

	}
}
