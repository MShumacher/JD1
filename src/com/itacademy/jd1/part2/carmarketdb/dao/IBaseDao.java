package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface IBaseDao<T> {

	Integer insert(T object) throws SQLException;

	List<T> getAll() throws SQLException;

	T getById(Integer id) throws SQLException;

	void deleteById(Integer id) throws SQLException;

	abstract String getTableName();

	List<String> getNamesColumns() throws SQLException;

	List<String> getDataTypesColumns() throws SQLException;

	// void updateByIdByList(int id, List values) ;

	void updateById(int id, Object enterObject) throws SQLException, IllegalArgumentException, IllegalAccessException;

}
