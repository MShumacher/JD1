package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.AbstractCar;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public interface ICarDao extends IBaseDao<Car> {

	Integer getId(Car object) throws SQLException;

	void delete(Car car) throws SQLException, IllegalArgumentException, IllegalAccessException;

	void findAndPrint(AbstractCar abstractСar)
			throws SQLException, IllegalArgumentException, IllegalAccessException;

}
