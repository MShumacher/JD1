package com.itacademy.jd1.part2.carmarketdb.command.user;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.RequestCar;
import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;

public class CommandViewBase extends CommandEnterCar {

	public CommandViewBase(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException {
		ICarDao carDao = CarDaoImpl.INSTANCE;
		RequestCar requestCar = new RequestCar(0, 0, 0, 0, 0, 0, 0, 0);
		carDao.findAndPrint(requestCar);
	}

}
