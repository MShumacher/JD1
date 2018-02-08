package com.itacademy.jd1.part2.carmarketdb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.dao.IModelDao;
import com.itacademy.jd1.part2.carmarketdb.model.Model;

public class ModelDaoImpl extends AbstractDao<Model> implements IModelDao {

	@Override
	public Model getByNameAndBrandId(String name, Integer brandId) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement
				.executeQuery("select * from " + getTableName() + " where name='" + name + "' and brand_id=" + brandId);

		ResultSet resultSet = statement.getResultSet();
		boolean hasNext = resultSet.next();
		Model result = null;
		if (hasNext) {
			result = handleRow(resultSet);
		}

		resultSet.close();
		statement.close();
		c.close();

		return result;
	}

	@Override
	protected Model handleRow(ResultSet resultSet) throws SQLException {
		Model model = new Model();
		model.setBrandId((Integer) resultSet.getObject("brand_id"));
		model.setId(resultSet.getInt("id"));
		model.setName(resultSet.getString("name"));
		return model;
	}

	@Override
	public Integer insert(Model object) throws SQLException {
		Connection c = getConnection();

		PreparedStatement preparedStatement = c.prepareStatement("insert into model (name,brand_id) values(?,?)",
				Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, object.getName());
		preparedStatement.setInt(2, object.getBrandId());

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
	public String getTableName() {
		return "model";
	}

	@Override
	public List<? extends Object> getAllByBrandId(Integer brandId) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery("select * from " + getTableName() + " where brand_id=" + brandId);

		ResultSet resultSet = statement.getResultSet();

		List<Model> result = new ArrayList<>();
		boolean hasNext = resultSet.next();
		while (hasNext) {
			result.add(handleRow(resultSet));
			hasNext = resultSet.next();
		}

		resultSet.close();
		statement.close();
		c.close();

		return result;
	}

}
