package com.itacademy.jd1.part2.excel;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Row implements Serializable {
	private Map<String, Cell> row = new TreeMap<String, Cell>();

	public Row() {
		super();
	}

	public Cell getCell(String j) {
		return row.get(j);
	}

	public void addCell(String j, Cell cell) {
		row.put(j, cell);
	}

	public boolean isCellExist(String j) {
		if (getCell(j) == null) {
			return false;
		} else {
			return true;
		}
	}
}
