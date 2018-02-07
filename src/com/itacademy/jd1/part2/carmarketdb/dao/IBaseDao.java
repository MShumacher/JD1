package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDao<T> {

	Integer insert(T object) throws SQLException;

	List<T> getAll() throws SQLException;

	T getById(Integer id) throws SQLException;

	void delete(Integer id) throws SQLException;

}
