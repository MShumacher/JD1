package com.itacademy.jd1.part2.classwork.dbsample.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itacademy.jd1.part2.classwork.dbsample.dao.IModelDao;
import com.itacademy.jd1.part2.classwork.dbsample.model.Model;

public class ModelDaoImpl extends AbstractDao<Model> implements IModelDao {

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
	protected String getTableName() {
		return "model";
	}

}
