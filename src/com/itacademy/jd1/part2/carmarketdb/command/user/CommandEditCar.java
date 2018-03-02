package com.itacademy.jd1.part2.carmarketdb.command.user;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public class CommandEditCar extends CommandEnterCar {

	public CommandEditCar(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException {
		System.out.println("Enter car you want to edit.");
		Car car = enterCar();
		ICarDao carDao = CarDaoImpl.INSTANCE;
		carDao.updateById(carDao.getId(car), car);
		System.out.println("Car was updated in base.");
	}

}
