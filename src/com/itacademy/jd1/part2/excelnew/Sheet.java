package com.itacademy.jd1.part2.excelnew;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Sheet implements Serializable {
	private Map<Integer, Row> sheet = new TreeMap<Integer, Row>();

	public Sheet() {
		super();
	}

	public Row getRow(int i) {
		return sheet.get(i);
	}

	public void addRow(Integer i, Row row) {
		sheet.put(i, row);
	}

	public boolean isRowExist(int i) {
		if (getRow(i) == null) {
			return false;
		} else {
			return true;
		}
	}
}