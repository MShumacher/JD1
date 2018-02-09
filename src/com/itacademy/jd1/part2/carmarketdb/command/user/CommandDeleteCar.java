package com.itacademy.jd1.part2.carmarketdb.command.user;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public class CommandDeleteCar extends CommandEnterCar {

	public CommandDeleteCar(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException {
		System.out.println("Enter car you want to delete.");
		Car car = enterCar();
		ICarDao carDao = new CarDaoImpl();
		carDao.delete(car);
		System.out.println("Car was deleted from base.");
	}

}
