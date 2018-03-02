package by.itacademy.jd1.web.dao;

import java.sql.SQLException;
import java.util.List;

import by.itacademy.jd1.web.model.Model;

public interface IModelDao extends IBaseDao<Model> {

	Model getAllByNameAndBrandId(String name, Integer brandId) throws SQLException;

	List<? extends Object> getAllByBrandId(Integer brandId) throws SQLException;

}
