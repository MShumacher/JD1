package com.itacademy.jd1.part2.carmarketdb.command;

import com.itacademy.jd1.part2.carmarketdb.Command;

public abstract class CommandEnterCar extends Command {

	public CommandEnterCar(String value, String output) {
		super(value, output);
	}
}
