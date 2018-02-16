package by.itacademy.jd1.web.model;

public class Car {

	private Integer id;
	private Integer modelId;
	private String fuelType;
	private Integer year;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
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
		return "Car [id=" + id + ", modelId=" + modelId + ", fuelType=" + fuelType + ", year=" + year + "]";
	}

}
