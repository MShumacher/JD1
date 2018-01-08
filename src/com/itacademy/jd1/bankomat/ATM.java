package com.itacademy.jd1.bankomat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.itacademy.classwork.bankomat.Slot;

public class ATM {
	private List<Cell> cells;
	private List<Cell> currentOperation;

	public ATM(List cells) {
		// super();
		Collections.sort(cells, new Comparator<Cell>() {
			@Override
			public int compare(Cell o1, Cell o2) {
				return o2.getNominal() - o1.getNominal();
			}
		});
		this.cells = cells;
		this.currentOperation = cells;
	}

	public void addMoney(int nominal, int quantity) {
		for (Cell cell : cells) {
			if (cell.available(nominal)) {
				cell.setQuantity(cell.getQuantity() + quantity);
				return;
			}
		}
		System.out.println("Not supported nominal");
	}

	public boolean giveMoney(int totalSum) {
		for (int i = 0; i < cells.size(); i++) {
			Cell cell = cells.get(i);
			int minQuantity = Math.min(totalSum / cell.getNominal(), cell.getQuantity());
			int currentSum = 0;
			for (int j = 0; j <= minQuantity; j++) {
				currentSum = cell.getNominal() * j;
				Cell cellJ = new Cell(cell.getNominal(), j);
				currentOperation.add(i, cellJ);
				if (totalSum - currentSum == 0) {
					break;
				}
			}
			totalSum -= currentSum;
			if (totalSum == 0) {
				return true;
			} else {
				totalSum += currentOperation.get(i).getQuantity() * currentOperation.get(i).getNominal();
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = "ATM loaded of:\r\n";
		for (Cell cell : cells) {
			str += String.format("[%s] - %s pc's\r\n", cell.getNominal(), cell.getQuantity());
		}
		return str;
	}

}
