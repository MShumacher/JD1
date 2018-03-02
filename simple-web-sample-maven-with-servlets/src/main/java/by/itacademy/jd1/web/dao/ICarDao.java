package by.itacademy.jd1.web.dao;

import java.sql.SQLException;

import by.itacademy.jd1.web.RequestCar;
import by.itacademy.jd1.web.model.Car;

public interface ICarDao extends IBaseDao<Car> {

	Integer getId(Car object) throws SQLException;

	void delete(Car car) throws SQLException, IllegalArgumentException, IllegalAccessException;

	void findAndPrint(RequestCar abstractСar) throws SQLException;
}
