package com.itacademy.jd1.part2.carmarketdb;

import com.itacademy.jd1.part2.carmarketdb.model.Car;

public class RequestCar extends Car {
	private Integer brandId;
	private Integer maxYear;
	private Integer maxPrice;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public RequestCar() {
	}

	public Integer getMaxYear() {
		return maxYear;
	}

	public RequestCar(Integer id, Integer fuelTypeId, Integer year, Integer price, Integer modelId, Integer brandId,
			Integer maxYear, Integer maxPrice) {
		super(id, fuelTypeId, year, price, modelId);
		this.brandId = brandId;
		this.maxYear = maxYear;
		this.maxPrice = maxPrice;
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
