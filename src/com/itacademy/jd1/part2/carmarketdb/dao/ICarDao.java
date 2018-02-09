package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.RequestCar;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public interface ICarDao extends IBaseDao<Car> {

	Integer getId(Car object) throws SQLException;

	void delete(Car car) throws SQLException, IllegalArgumentException, IllegalAccessException;

	void findAndPrint(RequestCar abstractСar) throws SQLException;
}
