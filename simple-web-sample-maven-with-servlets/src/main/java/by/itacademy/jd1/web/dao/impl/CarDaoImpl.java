package by.itacademy.jd1.web.dao.impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import by.itacademy.jd1.web.RequestCar;
import by.itacademy.jd1.web.dao.ICarDao;
import by.itacademy.jd1.web.model.Car;

public class CarDaoImpl extends AbstractDao<Car> implements ICarDao {
	
	public static final ICarDao INSTANCE = new CarDaoImpl();

	private CarDaoImpl() {
		super();
	}
	
	public void delete(Car car) throws SQLException, IllegalArgumentException, IllegalAccessException {
		Connection c = getConnection();
		Statement statement = c.createStatement();

		List<String> namesColumns = getNamesColumns();
		Class<?> clazz = car.getClass();
		Field[] fields = clazz.getDeclaredFields();
		StringBuilder query = new StringBuilder("delete from " + getTableName() + " where");

		for (int i = 1; i < fields.length; i++) {
			fields[i].setAccessible(true);
			query.append(" " + namesColumns.get(i - 1) + "=" + fields[i].get(car) + " and");
		}
		statement.executeUpdate(query.substring(0, query.length() - 3).toString());
		statement.close();
		c.close();
	}

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
	public String getTableName() {
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
		statement.executeQuery(
				String.format("select * from %s where model_id=%s and fueltype_id=%s and year=%s and price=%s",
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

	@Override
	public void findAndPrint(RequestCar abstractCar) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		StringBuilder query = new StringBuilder(
				"select b.name, m.name, f.name, c.year, c.price from car c join model m on (c.model_id=m.id) join brand b on (m.brand_id=b.id) join fueltype f on (c.fueltype_id=f.id) where ");
		if (abstractCar.getBrandId() != 0) {
			query.append("m.brand_id =" + abstractCar.getBrandId() + " and ");
		}
		if (abstractCar.getModelId() != 0) {
			query.append("c.model_id =" + abstractCar.getModelId() + " and ");
		}
		if (abstractCar.getFuelTypeId() != 0) {
			query.append("c.fueltype_id =" + abstractCar.getFuelTypeId() + " and ");
		}
		if (abstractCar.getMaxPrice() != 0) {
			query.append("c.price between " + abstractCar.getPrice() + " and " + abstractCar.getMaxPrice() + " and ");
		} else {
			query.append("c.price>=" + abstractCar.getPrice() + " and ");
		}
		if (abstractCar.getMaxYear() != 0) {
			query.append("c.year between " + abstractCar.getYear() + " and " + abstractCar.getMaxYear());
		} else {
			query.append("c.year>=" + abstractCar.getYear());
		}
		// System.out.println(query);
		statement.executeQuery(query.toString());
		ResultSet resultSet = statement.getResultSet();
		boolean hasNext = resultSet.next();
		while (hasNext) {
			System.out.println(String.format("%s | %s | %s | %s | %s", resultSet.getString(1), resultSet.getString(2),
					resultSet.getString(3), resultSet.getString(4), resultSet.getString(5)));
			hasNext = resultSet.next();
		}
		resultSet.close();
		statement.close();
		c.close();
	}
}
