package com.itacademy.jd1.part2.excel;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Sheet implements Serializable{
	private Map<Integer, Row> sheet = new TreeMap<Integer, Row>();

	public Sheet(Row row, int position) {
		this.sheet.put(position, row);
	}

	public Row getRow(int i) {
		return this.sheet.get(i);
	}

	public void PrintCell(int i, int j) {
		if (this.getRow(i) != null) {
			System.out.println(String.format("[%s,%s]=%s", i, j, this.getRow(i).getCell(j).getValue()));
		} else {
			System.out.println(String.format("[%s,%s]=%s", i, j, "null"));
		}
	}

	public Cell GetCell(int i, int j) {
		if (this.getRow(i) != null) {
			return this.getRow(i).getCell(j);
		} else
			return null;
	}

	public void SetCell(int i, int j, String value) {
		this.getRow(i).getCell(j).setValue(value);
	}
}