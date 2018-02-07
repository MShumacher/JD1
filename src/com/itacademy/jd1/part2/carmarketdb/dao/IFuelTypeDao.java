package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.model.FuelType;

public interface IFuelTypeDao extends IBaseDao<FuelType> {

	FuelType getByName(String name) throws SQLException;

}
