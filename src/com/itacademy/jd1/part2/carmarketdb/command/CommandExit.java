package com.itacademy.jd1.part2.carmarketdb.command;

import com.itacademy.jd1.part2.carmarketdb.Command;

public class CommandExit extends Command {

	public CommandExit(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
	}
}
