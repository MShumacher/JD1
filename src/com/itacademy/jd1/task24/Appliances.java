package com.itacademy.jd1.task24;

public abstract class Appliances {
	private boolean isOn;
	private String model;
	private String type;
	private String subType;
	private String brand;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Appliances(String brand) {
		this.brand = brand;
		isOn = false;
	}

	public void printState() {
		if (isOn) {
			System.out.println(String.format("%s %s is ON.", this.type, this.brand));
		} else {
			System.out.println(String.format("%s %s is OFF.", this.type, this.brand));
		}
	}

	public boolean getState() {
		return isOn;
	}

	public void on() {
		isOn = true;
	}

	public void off() {
		isOn = false;
	}
}
