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
		// isValueValid(value);
		// if (isValueString(value)) {
		this.value = value;
		// }
	}

	private boolean isValueValid(String value) {
		if ((value.charAt(0) == '\'') || (value.matches("/d")) || (value.matches("(SUM|AVG|MAX|MIN)(([^(^)]*))"))) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isValueString(String value) {
		if (value.charAt(0) == '\'') {
			return true;
		} else {
			return false;
		}
	}
}
