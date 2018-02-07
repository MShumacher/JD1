package com.itacademy.jd1.part2.carmarketdb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public class CarDaoImpl extends AbstractDao<Car> implements ICarDao {

	@Override
	protected Car handleRow(ResultSet resultSet) throws SQLException {
		Car car = new Car();
		car.setId(resultSet.getInt("id"));
		car.setModelId((Integer) resultSet.getObject("model_id"));
		car.setFuelTypeId((Integer) resultSet.getObject("fueltype_id"));
		car.setPrice(resultSet.getInt("price"));
		car.setYear(resultSet.getInt("year"));
		return car;
	}

	@Override
	protected String getTableName() {
		return "car";
	}

	@Override
	public Integer insert(Car object) throws SQLException {
		Connection c = getConnection();

		PreparedStatement preparedStatement = c.prepareStatement(
				"insert into car (model_id,fueltype_id,year,price) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

		preparedStatement.setInt(1, object.getModelId());
		preparedStatement.setInt(2, object.getFuelTypeId());
		preparedStatement.setInt(3, object.getYear());
		preparedStatement.setInt(4, object.getPrice());

		preparedStatement.executeUpdate();

		final ResultSet rs = preparedStatement.getGeneratedKeys();
		rs.next();
		final int id = rs.getInt("id");

		rs.close();
		preparedStatement.close();
		c.close();

		return id;
	}

	@Override
	public Integer getId(Car car) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery(String.format("select * from %s where model_id=%s and fueltype_id=%s and year=%s and price=%s",
				getTableName(), car.getModelId(), car.getFuelTypeId(), car.getYear(), car.getPrice()));

		ResultSet resultSet = statement.getResultSet();
		boolean hasNext = resultSet.next();
		Integer result = null;
		if (hasNext) {
			result = handleRow(resultSet).getId();
		}

		resultSet.close();
		statement.close();
		c.close();

		return result;

	}
}
