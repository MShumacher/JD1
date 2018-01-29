package com.itacademy.jd1.part2.excel;

import java.util.ResourceBundle;

public abstract class Command {
	private String value;
	private String output;
	private ResourceBundle rb;

	public Command(String value, String output, ResourceBundle rb) {
		super();
		this.value = value;
		this.output = output;
		this.rb = rb;
	}

	public void print() {
		System.out.println(String.format("%s \"%s\"", output, value));
	}

	public ResourceBundle getRb() {
		return rb;
	}

	public void setRb(ResourceBundle rb) {
		this.rb = rb;
	}

	public String getValue() {
		return value;
	}

	abstract public void execute();
}
