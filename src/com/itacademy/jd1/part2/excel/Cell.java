package com.itacademy.jd1.part2.excel;

import java.io.Serializable;

public class Cell implements Serializable {
	
	private String value;

	public Cell(String value) {
		this.value = value;
	}

	public Cell() {
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
