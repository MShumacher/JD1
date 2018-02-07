package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.model.Car;

public interface ICarDao extends IBaseDao<Car> {

	Integer getId(Car object) throws SQLException;

}
