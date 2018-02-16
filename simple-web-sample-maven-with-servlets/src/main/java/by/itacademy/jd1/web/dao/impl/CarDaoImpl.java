package by.itacademy.jd1.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.itacademy.jd1.web.dao.ICarDao;
import by.itacademy.jd1.web.model.Car;

public class CarDaoImpl extends AbstractDao<Car> implements ICarDao {
	public static final ICarDao INSTANCE = new CarDaoImpl();

	private CarDaoImpl() {
		super();
	}
	@Override
	protected Car handleRow(ResultSet resultSet) throws SQLException {
		Car car = new Car();
		car.setId(resultSet.getInt("id"));
		car.setModelId((Integer) resultSet.getObject("model_id"));
		car.setFuelType((String) resultSet.getObject("fueltype"));
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
		preparedStatement.setString(2, object.getFuelType());
		preparedStatement.setInt(3, object.getYear());

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
