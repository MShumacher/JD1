package com.itacademy.jd1.part2.carmarketdb.command.user;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.RequestCar;
import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;

public class CommandFindCar extends CommandEnterCar {

	public CommandFindCar(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException {
		System.out.println("Enter a query to search.");
		ICarDao carDao = new CarDaoImpl();
		RequestCar requestCar = enterRequestCar();
		carDao.findAndPrint(requestCar);
	}
}
