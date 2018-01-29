package com.itacademy.jd1.part2.excel.commands;

import java.util.ResourceBundle;
import java.util.Scanner;

import com.itacademy.jd1.part2.excel.Command;
import com.itacademy.jd1.part2.excel.Sheet;

public abstract class CommandForCell extends Command {
	protected Sheet sheet;

	public CommandForCell(String value, String output, ResourceBundle rb, Sheet sheet) {
		super(value, output, rb);
		this.sheet = sheet;
	}

	@Override
	public void execute() {
	}

	protected String enterCorrectAddress() {
		String s;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Please, enter cell address. For example [23,D]. (Remember [1..1000,A-Z]).");
			s = scan.next();
		} while (!isAddressValid(s));
		return s;
	}

	private boolean isAddressValid(String s) {
		if (s.matches("\\[([1-9][0-9]{0,2}|1000),[A-Z]\\]")) {
			return true;
		} else {
			System.out.println("Incorrect cell address.");
			return false;
		}
	}
}