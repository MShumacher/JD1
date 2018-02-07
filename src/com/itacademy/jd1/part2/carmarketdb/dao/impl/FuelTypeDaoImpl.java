package com.itacademy.jd1.part2.carmarketdb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itacademy.jd1.part2.carmarketdb.dao.IFuelTypeDao;
import com.itacademy.jd1.part2.carmarketdb.model.FuelType;

public class FuelTypeDaoImpl extends AbstractDao<FuelType> implements IFuelTypeDao {

	@Override
	public FuelType getByName(String name) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery("select * from " + getTableName() + " where name='" + name+"'");

		ResultSet resultSet = statement.getResultSet();
		boolean hasNext = resultSet.next();
		FuelType result = null;
		if (hasNext) {
			result = handleRow(resultSet);
		}

		resultSet.close();
		statement.close();
		c.close();

		return result;
	}

	@Override
	protected FuelType handleRow(ResultSet resultSet) throws SQLException {
		FuelType fuelType = new FuelType();
		fuelType.setId(resultSet.getInt("id"));
		fuelType.setName(resultSet.getString("name"));
		return fuelType;

	}

	@Override
	protected String getTableName() {
		return "fueltype";
	}

	@Override
	public Integer insert(FuelType object) throws SQLException {
		Connection c = getConnection();

		PreparedStatement preparedStatement = c.prepareStatement("insert into fueltype (name) values(?)",
				Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, object.getName());

		preparedStatement.executeUpdate();

		final ResultSet rs = preparedStatement.getGeneratedKeys();
		rs.next();
		final int id = rs.getInt("id");

		rs.close();
		preparedStatement.close();
		c.close();

		return id;
	}
}
