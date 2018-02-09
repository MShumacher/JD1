package com.itacademy.jd1.part2.carmarketdb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.command.CommandExit;
import com.itacademy.jd1.part2.carmarketdb.command.admin.CEnterAdmin;
import com.itacademy.jd1.part2.carmarketdb.command.user.CEnterUser;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, SQLException {
		List<Command> firstLevelCommands = new ArrayList<Command>();
		firstLevelCommands.add(new CEnterAdmin("admin", "For work with base as admin print"));
		firstLevelCommands.add(new CEnterUser("user", "For work with base as user print"));
		firstLevelCommands.add(new CommandExit("exit", "For exit print"));
		Menu menu = new Menu(firstLevelCommands);
		menu.execute();
		System.out.println("Thank you for choosing our carmarket.");
	}

}
