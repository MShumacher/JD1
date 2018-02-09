package com.itacademy.jd1.part2.carmarketdb.command.user;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public class CommandAddCar extends CommandEnterCar {

	public CommandAddCar(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws SQLException, IllegalArgumentException, IllegalAccessException {
		System.out.println("Enter new car.");
		Car car = enterCar();
		ICarDao carDao = new CarDaoImpl();
		carDao.insert(car);
		System.out.println("Car was added in base.");
	}

}
