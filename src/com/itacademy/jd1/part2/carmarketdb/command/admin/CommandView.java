package com.itacademy.jd1.part2.carmarketdb.command.admin;

import java.sql.SQLException;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;

public class CommandView extends CommandDao {

	public CommandView(String value, String output, IBaseDao dao, Object object) {
		super(value, output, dao, object);
	}

	@Override
	public void execute() throws SQLException {
		printList(this.getDao().getAll());
	}

	private static void printList(List<? extends Object> all) {
		for (Object object : all) {
			System.out.println(object.toString());
		}
	}
}
