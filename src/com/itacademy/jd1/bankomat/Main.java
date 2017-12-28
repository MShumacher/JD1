package com.itacademy.jd1.bankomat;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(20, 0));
		cells.add(new Cell(50, 0));
		cells.add(new Cell(100, 0));
		ATM atm = new ATM(cells);
		atm.printState();
		atm.addMoney(100, 12);
		atm.addMoney(50, 1);
		atm.addMoney(20, 12);
		atm.printState();
		System.out.println(atm.giveMoney(810,0));
	}

}
