package by.itacademy.jd1.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.itacademy.jd1.web.dao.IFuelTypeDao;
import by.itacademy.jd1.web.model.FuelType;

public class FuelTypeDaoImpl extends AbstractDao<FuelType> implements IFuelTypeDao {
	
	public static final IFuelTypeDao INSTANCE = new FuelTypeDaoImpl();

	private FuelTypeDaoImpl() {
		super();
	}
	
	@Override
	public FuelType getByName(String name) throws SQLException{
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery(String.format("select * from %s where name='%s'", getTableName(), name));

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
	protected FuelType handleRow(ResultSet resultSet) throws SQLException{
		FuelType fuelType = new FuelType();
		fuelType.setId(resultSet.getInt("id"));
		fuelType.setName(resultSet.getString("name"));
		return fuelType;

	}

	@Override
	public String getTableName() {
		return "fueltype";
	}

	@Override
	public Integer insert(FuelType object) throws SQLException{
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
