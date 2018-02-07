package com.itacademy.jd1.part2.carmarket;

public class CommandClear extends Command {

	public CommandClear(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		CarBase carBase = CarBase.getMyBase();
		carBase.clear();
	}

}
