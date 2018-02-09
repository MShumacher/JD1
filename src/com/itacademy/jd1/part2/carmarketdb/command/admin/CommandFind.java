package com.itacademy.jd1.part2.carmarketdb.command.admin;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;

public class CommandFind extends CommandDao {

	public CommandFind(String value, String output, IBaseDao dao, Object object) {
		super(value, output, dao, object);
	}

	@Override
	public void execute() {
		int id = enterId();
		try {
			System.out.println(this.getDao().getById(id));
		} catch (SQLException | IllegalArgumentException e) {
			System.out.println("Something was wrong. Please, try again later.");
		}
	}
}