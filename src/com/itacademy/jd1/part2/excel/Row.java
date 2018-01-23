package com.itacademy.jd1.part2.excel;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Row implements Serializable {
	private Map<String, Cell> row = new TreeMap<String, Cell>();

	public Row(String j, Cell cell) {
		this.row.put(j, cell);
	}

	public Cell getCell(String j) {
		return this.row.get(j);
	}

	public void setCell(String j, Cell cell) {
		this.row.put(j, cell);
	}
}
