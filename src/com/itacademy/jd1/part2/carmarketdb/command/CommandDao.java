package com.itacademy.jd1.part2.carmarketdb.command;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.itacademy.jd1.part2.carmarketdb.Command;
import com.itacademy.jd1.part2.carmarketdb.Menu;
import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;

public class CommandDao extends Command {
	private IBaseDao dao;
	private Object object;

	public Object getObject() {
		return object;
	}

	public CommandDao(String value, String output, IBaseDao dao, Object object) {
		super(value, output);
		this.dao = dao;
		this.object = object;
	}

	public IBaseDao getDao() {
		return dao;
	}

	@Override
	public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException {
		List<Command> secondLevelCommands = new ArrayList<Command>();
		String nameTable = this.getValue();
		secondLevelCommands.add(new CommandView("view", String.format("For viewing all table %s print", nameTable),
				this.dao, this.object));
		secondLevelCommands.add(new CommandInsert("insert", String.format("For inserting %s to table print", nameTable),
				this.dao, this.object));
		secondLevelCommands.add(new CommandDelete("delete",
				String.format("For deleting %s from table print", nameTable), this.dao, this.object));
		// secondLevelCommands.add(new CommandClear("clear", "For clearing %s base
		// print"));
		secondLevelCommands.add(new CommandFind("find", String.format("For finding %s in table print", nameTable),
				this.dao, this.object));
		secondLevelCommands.add(new CommandEdit("edit", String.format("For editing %s in table print", nameTable),
				this.dao, this.object));
		secondLevelCommands.add(new CommandExit("exit", "For exit to previous menu print"));
		Menu menu = new Menu(secondLevelCommands);
		menu.execute();
	}

	protected int enterId() {
		System.out.println(String.format("Print id %s you want to work with.", this.getDao().getTableName()));
		int id = 0;
		Scanner scan = new Scanner(System.in);
		try {
			id = scan.nextInt();
		} catch (InputMismatchException e) {
			return enterId();
		}
		return id;
	}

	protected Object enterObject(Object object) throws SQLException {
		Scanner scan = new Scanner(System.in);
		Class<?> c = object.getClass();
		Field[] fields = c.getDeclaredFields();
		for (int i = 1; i < fields.length; i++) {
			enterField(object, fields[i]);
		}
		return object;
	}

	private static void enterField(Object object, Field field) {
		System.out.println("Print " + field.getName().toString());
		Scanner scan = new Scanner(System.in);
		field.setAccessible(true);
		try {
			switch (field.getType().getSimpleName()) {
			case "String":
				String newField = String.format("%s", scan.nextLine());
				field.set(object, newField);
				break;
			case "Integer":
				field.set(object, scan.nextInt());
				break;
			}
		} catch (IllegalArgumentException | IllegalAccessException | InputMismatchException e) {
			System.out.println("Enter correct value.");
			enterField(object, field);
		}
	}

	// protected List enterObject() throws SQLException {
	// List<String> namesColumns = this.getDao().getNamesColumns();
	// List<String> dataTypesColumns = this.getDao().getDataTypesColumns();
	// List values = new ArrayList();
	// Scanner scan = new Scanner(System.in);
	// for (int i = 0; i < namesColumns.size(); i++) {
	// System.out.println("Print " + namesColumns.get(i));
	// switch (dataTypesColumns.get(i)) {
	// case "integer":
	// values.add(scan.nextInt());
	// break;
	// case "character varying":
	// values.add(String.format("'%s'", scan.nextLine()));
	// break;
	// }
	// }
	// return values;
	// }
}
