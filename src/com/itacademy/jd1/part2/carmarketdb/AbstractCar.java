package com.itacademy.jd1.part2.carmarketdb;

import com.itacademy.jd1.part2.carmarketdb.model.Car;

public class AbstractCar extends Car {
	private Integer brandId;
	private Integer maxYear;
	private Integer maxPrice;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public AbstractCar() {
	}

	public Integer getMaxYear() {
		return maxYear;
	}

	public void setMaxYear(Integer maxYear) {
		this.maxYear = maxYear;
	}

	public Integer getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}
}
