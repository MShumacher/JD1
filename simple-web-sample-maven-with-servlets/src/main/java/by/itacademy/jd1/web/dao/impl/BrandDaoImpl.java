package by.itacademy.jd1.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.itacademy.jd1.web.dao.IBrandDao;
import by.itacademy.jd1.web.model.Brand;

public class BrandDaoImpl extends AbstractDao<Brand> implements IBrandDao {
	public static final IBrandDao INSTANCE = new BrandDaoImpl();

	private BrandDaoImpl() {
		super();
	}
	@Override
	protected String getTableName() {
		return "brand";
	}

	@Override
	protected Brand handleRow(ResultSet resultSet) throws SQLException {
		Brand object = new Brand();
		object.setId(resultSet.getInt("id"));
		object.setName(resultSet.getString("name"));
		return object;
	}

	@Override
	public Integer insert(Brand object) throws SQLException {
		Connection c = getConnection();

		PreparedStatement preparedStatement = c.prepareStatement("insert into brand (name) values(?)",
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
