package com.itacademy.jd1.part2.carmarketdb;

import java.sql.SQLException;

public abstract class Command {
	private String value;
	private String output;

	public Command(String value, String output) {
		super();
		this.value = value;
		this.output = output;
	}

	public void print() {
		System.out.println(String.format("%s \"%s\"", output, value));
	}

	public String getValue() {
		return value;
	}

	abstract public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException;
}
