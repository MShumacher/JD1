package com.itacademy.jd1.part2.carmarketdb.command;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public class CommandDelete extends CommandEnterCar {

	public CommandDelete(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws IllegalArgumentException, IllegalAccessException {
		ICarDao carDao = new CarDaoImpl();
		Car car;
		try {
			car = enterCar();
			carDao.delete(carDao.getId(car));
			System.out.println("Car was deleted from carBase.");
		} catch (SQLException e) {
			System.out.println("Something was wrong. Please, try again later.");
		}
	}
}
