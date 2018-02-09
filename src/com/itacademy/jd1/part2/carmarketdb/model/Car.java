package com.itacademy.jd1.part2.carmarketdb.model;

public class Car {

	private Integer id;
	private Integer fuelTypeId;
	private Integer year;
	private Integer price;
	private Integer modelId;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Car() {
	}

	public Car(Integer id, Integer fuelTypeId, Integer year, Integer price, Integer modelId) {
		super();
		this.id = id;
		this.fuelTypeId = fuelTypeId;
		this.year = year;
		this.price = price;
		this.modelId = modelId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(Integer fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", modelId=" + modelId + ", fuelTypeId=" + fuelTypeId + ", year=" + year + ", price="
				+ price + "]";
	}
}
