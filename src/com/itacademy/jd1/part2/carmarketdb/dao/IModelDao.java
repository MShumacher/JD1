package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.model.Model;

public interface IModelDao extends IBaseDao<Model> {

	Model getByNameAndBrandId(String name, Integer brandId) throws SQLException;

	List<? extends Object> getAllByBrandId(Integer brandId) throws SQLException;

}
