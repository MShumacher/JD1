package com.itacademy.jd1.part2.carmarketdb.command.admin;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;

public class CommandEdit extends CommandDao {

	public CommandEdit(String value, String output, IBaseDao dao, Object object) {
		super(value, output, dao, object);
	}

	@Override
	public void execute() {
		int id = enterId();
		try {
			this.getDao().updateById(id, enterObject(this.getObject()));
			System.out.println(String.format("%s with id=%s was updated.", this.getDao().getTableName(), id));
		} catch (SQLException | IllegalAccessException e) {
			System.out.println(e.getMessage());
			System.out.println("Something was wrong. Please, try again later.");
		}
	}
}
