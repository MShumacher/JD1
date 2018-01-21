package com.itacademy.jd1.part2.excel;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Row implements Serializable {
	private Map<Integer, Cell> row = new TreeMap<Integer, Cell>();

	public Row(Cell cell, int i) {
		this.row.put(i, cell);
	}

	public Cell getCell(int j) {
		return this.row.get(j);
	}
	public void setCell(int j,Cell cell) {
		this.row.put(j,cell);
	}
}
