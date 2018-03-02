package by.itacademy.jd1.web.dao;

import java.sql.SQLException;

import by.itacademy.jd1.web.model.Brand;

public interface IBrandDao extends IBaseDao<Brand> {

	Brand getByName(String name) throws SQLException;

}
