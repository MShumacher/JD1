package com.itacademy.jd1.part2.carmarketdb.command.admin;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;

public class CommandDelete extends CommandDao {

	public CommandDelete(String value, String output, IBaseDao dao, Object object) {
		super(value, output, dao, object);
	}

	@Override
	public void execute() {
		int id = enterId();
		try {
			this.getDao().deleteById(id);
			System.out.println(
					String.format("%s with id=%s was deleted from carBase.", this.getDao().getTableName(), id));
		} catch (SQLException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Something was wrong. Please, try again later.");
		}
	}
}
