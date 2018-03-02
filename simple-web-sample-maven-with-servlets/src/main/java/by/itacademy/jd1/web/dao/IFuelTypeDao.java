package by.itacademy.jd1.web.dao;

import java.sql.SQLException;

import by.itacademy.jd1.web.model.FuelType;

public interface IFuelTypeDao extends IBaseDao<FuelType> {

	FuelType getByName(String name) throws SQLException;

}
