package by.itacademy.jd1.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.itacademy.jd1.web.dao.IBrandDao;
import by.itacademy.jd1.web.dao.IModelDao;
import by.itacademy.jd1.web.model.Model;

public class ModelDaoImpl extends AbstractDao<Model> implements IModelDao {
	public static final IModelDao INSTANCE = new ModelDaoImpl();

	private ModelDaoImpl() {
		super();
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
	protected String getTableName() {
		return "model";
	}

}
