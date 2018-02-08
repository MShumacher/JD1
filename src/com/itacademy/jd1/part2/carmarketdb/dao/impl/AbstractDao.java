package com.itacademy.jd1.part2.carmarketdb.dao.impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;

public abstract class AbstractDao<T> implements IBaseDao<T> {

	@Override
	public void updateById(int id, Object object)
			throws SQLException, IllegalArgumentException, IllegalAccessException {
		Connection c = getConnection();
		Statement statement = c.createStatement();
		List<String> namesColumns = getNamesColumns();
		Class<?> clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String query = "update " + getTableName() + " set";

		for (int i = 1; i < fields.length; i++) {
			fields[i].setAccessible(true);
			query += " " + namesColumns.get(i - 1) + "=" + fields[i].get(object) + " ,";
		}
		query = query.substring(0, query.length() - 1);
		query += "where id=" + id;
		statement.executeUpdate(query);
		statement.close();
		c.close();
	}

	@Override
	public void updateByIdByList(int id, List values) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		List<String> namesColumns = getNamesColumns();
		String query = "update " + getTableName() + " set";
		for (int i = 0; i < values.size(); i++) {
			query += " " + namesColumns.get(i) + "=" + values.get(i) + " ,";
		}
		query = query.substring(0, query.length() - 1);
		query += "where id=" + id;

		statement.executeUpdate(query);
		statement.close();
		c.close();
	}

	@Override
	public List<String> getNamesColumns() throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery(String
				.format("select column_name from information_schema.columns where table_name = '%s'", getTableName()));
		ResultSet resultSet = statement.getResultSet();
		List<String> result = new ArrayList<String>();
		boolean hasNext = resultSet.next();
		resultSet.next();
		while (hasNext) {
			result.add(resultSet.getString(1));
			hasNext = resultSet.next();
		}
		resultSet.close();
		statement.close();
		c.close();
		return result;
	}

	@Override
	public List<String> getDataTypesColumns() throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery(String.format("select data_type from information_schema.columns where table_name = '%s'",
				getTableName()));
		ResultSet resultSet = statement.getResultSet();
		List<String> result = new ArrayList<String>();
		boolean hasNext = resultSet.next();
		resultSet.next();
		while (hasNext) {
			result.add(resultSet.getString(1));
			hasNext = resultSet.next();
		}
		resultSet.close();
		statement.close();
		c.close();
		return result;
	}

	@Override
	public T getById(Integer id) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery("select * from " + getTableName() + " where id=" + id);

		ResultSet resultSet = statement.getResultSet();
		boolean hasNext = resultSet.next();
		T result = null;
		if (hasNext) {
			result = handleRow(resultSet);
		}

		resultSet.close();
		statement.close();
		c.close();

		return result;
	}

	@Override
	public List<T> getAll() throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery("select * from " + getTableName());

		ResultSet resultSet = statement.getResultSet();

		List<T> result = new ArrayList<>();
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

	@Override
	public void deleteById(Integer id) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeUpdate(String.format("delete from %s where id=%s", getTableName(), id));

		statement.close();
		c.close();
	}

	protected Connection getConnection() throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/poleshkevich", "postgres", "1");
		return c;
	}

	protected abstract T handleRow(ResultSet resultSet) throws SQLException;

	public abstract String getTableName();
}
