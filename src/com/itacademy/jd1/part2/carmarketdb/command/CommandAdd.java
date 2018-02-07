package com.itacademy.jd1.part2.carmarketdb.command;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;

public class CommandAdd extends CommandEnterCar {

	public CommandAdd(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws IllegalArgumentException, IllegalAccessException {
		ICarDao carDao = new CarDaoImpl();
		try {
			Integer generatedId = carDao.insert(enterCar());
			System.out.println("Car was added in carBase.");
		} catch (SQLException e) {
			System.out.println("Something was wrong. Please, try again later.");
		}
	}
}
