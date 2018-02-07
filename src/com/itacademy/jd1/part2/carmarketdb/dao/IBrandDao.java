package com.itacademy.jd1.part2.carmarketdb.dao;

import java.sql.SQLException;

import com.itacademy.jd1.part2.carmarketdb.model.Brand;

public interface IBrandDao extends IBaseDao<Brand> {

	Brand getByName(String name) throws SQLException;

}
