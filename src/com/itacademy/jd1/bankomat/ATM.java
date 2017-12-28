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

	public void printState() {
		System.out.println("ATM loaded of:");
		for (Cell cell : cells) {
			System.out.println(String.format("[%s] - %s ", cell.getNominal(), cell.getQuantity()));
		}

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

	public boolean giveMoney(int totalSum, int k) {
		int currentSum = totalSum;

		/*
		 * Iterator iterator=cells.iterator(); while(iterator.hasNext()) {
		 * iterator.next() }
		 */
		int minQuantity = Math.min(currentSum / cells.get(k).getNominal(), cells.get(k).getQuantity());
		// for (int j = 0; j <= minQuantity; j++) {
		currentSum -= cells.get(k).getNominal() * minQuantity;
		if (currentSum == 0) {
			currentOperation.set(k, new Cell(cells.get(k).getNominal(), minQuantity));
			return true;
		} else {
			if (k != cells.size()-1) {

				currentOperation.set(k, new Cell(cells.get(k).getNominal(), minQuantity));
				giveMoney(currentSum, ++k);
			} else {
				currentOperation.set(k, new Cell(cells.get(k).getNominal(), minQuantity));
			}
			giveMoney(totalSum, --k);
		}

		/*
		 * for (Cell cell : cells) { int minQuantity = Math.min(currentSum /
		 * cell.getNominal(), cell.getQuantity()); currentSum -= cell.getNominal() *
		 * minQuantity; currentOperation.add(new Cell(cell.getNominal(), minQuantity));
		 * if (currentSum == 0) { return true; } else if (currentSum > 0) {
		 * giveMoney(currentSum); } else { currentOperation.clear();
		 * giveMoney(totalSum+); } } currentOperation.clear(); giveMoney(totalSum -
		 * minQuantity - 1);
		 */
		return false;

	}

}
