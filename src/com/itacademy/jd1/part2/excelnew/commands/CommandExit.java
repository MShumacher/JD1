package com.itacademy.jd1.part2.excelnew.commands;

import com.itacademy.jd1.part2.excelnew.Command;

public class CommandExit extends Command {
	private int level;

	public CommandExit(String value, String output, int level) {
		super(value, output);
		this.level = level;
	}

	@Override
	public void execute() {
		if (this.level == 1) {

			System.exit(0);
		}
	}
}
