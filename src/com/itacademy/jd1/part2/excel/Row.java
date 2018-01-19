package com.itacademy.jd1.part2.excel;

import java.util.Map;
import java.util.TreeMap;

public class Row {
	private Map<Integer, Cell> row = new TreeMap<Integer, Cell>();

	public Row(Cell cell, int i) {
		this.row.put(i, cell);
	}

	public Cell getCell(int i) {
		return this.row.get(i);
	}
}
