package com.itacademy.jd1.part2.excel;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Sheet implements Serializable {
	private Map<Integer, Row> sheet = new TreeMap<Integer, Row>();

	public Sheet(int i, Row row) {
		this.sheet.put(i, row);
	}

	public Row getRow(int i) {
		return this.sheet.get(i);
	}

	public void setRow(int i, Row row) {
		this.sheet.put(i, row);
	}

	public void PrintCell(int i, String j) {
		if (this.getRow(i) != null) {
			System.out.println(String.format("[%s,%s]=%s", i, j, this.getRow(i).getCell(j).getValue()));
		} else {
			System.out.println(String.format("[%s,%s]=%s", i, j, "null"));
		}
	}

	public Cell GetCell(int i, String j) {
		if (this.getRow(i) != null) {
			return this.getRow(i).getCell(j);
		} else
			return null;
	}

	public void SetCell(int i, String j, String value) {
		this.getRow(i).getCell(j).setValue(value);
	}
}