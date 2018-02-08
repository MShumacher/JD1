package com.itacademy.jd1.part2.carmarketdb.model;

public class Model {
	private Integer id;
	private String name;
	private Integer brandId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", brandId=" + brandId + ", name=" + name + "]";
	}

}
