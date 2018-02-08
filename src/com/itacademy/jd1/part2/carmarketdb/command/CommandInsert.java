package com.itacademy.jd1.part2.carmarketdb.command;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;

public class CommandInsert extends CommandDao {

	public CommandInsert(String value, String output, IBaseDao dao, Object object) {
		super(value, output, dao, object);
	}

	@Override
	public void execute() {
		try {
			Integer generatedId = this.getDao().insert(enterObject(this.getObject()));
			System.out.println(this.getDao().getTableName() + " was added in table.");
		} catch (IllegalArgumentException | SQLException e) {
			System.out.println("Something was wrong. Please, try again later.");
		}
	}
}
