package com.itacademy.jd1.part2.carmarketdb.command;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.AbstractCar;
import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;

public class CommandFindCar extends CommandEnterCar {

	public CommandFindCar(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws SQLException, IllegalArgumentException, IllegalAccessException {
		// Car car = enterCar();
		ICarDao carDao = new CarDaoImpl();
		// carDao.insert(car);
		// System.out.println("Car was added in base.");

		// carDao.delete(car);
		// System.out.println("Car was deleted from base.");
		AbstractCar abstractСar = enterAbstractCar();
		carDao.findAndPrint(abstractСar);

	}
}
