
package com.itacademy.jd1.part2.carmarketdb.command.user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.Command;
import com.itacademy.jd1.part2.carmarketdb.Menu;
import com.itacademy.jd1.part2.carmarketdb.command.CommandExit;

public class CEnterUser extends Command {

	public CEnterUser(String value, String output) {
		super(value, output);
	}

	public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException {
		List<Command> secondLevelCommands = new ArrayList<Command>();
		secondLevelCommands.add(new CommandAddCar("add", "For adding car in base print"));
		secondLevelCommands.add(new CommandDeleteCar("delete", "For deleting car in base print"));
		secondLevelCommands.add(new CommandEditCar("edit", "For editing car in base print"));
		secondLevelCommands.add(new CommandViewBase("view", "For viewing all car from base print"));
		secondLevelCommands.add(new CommandFindCar("find", "For finding car in base print"));
		secondLevelCommands.add(new CommandExit("exit", "For exit to previous menu print"));
		Menu menu = new Menu(secondLevelCommands);
		menu.execute();
	}

}