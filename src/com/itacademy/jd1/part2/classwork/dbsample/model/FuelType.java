package com.itacademy.jd1.part2.classwork.dbsample.model;

public class FuelType {

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FuelType [id=" + id + ", name=" + name + "]";
	}

}
