package com.itacademy.jd1.task24;

abstract class Appliances {
	private boolean isOn;
	private String model;
	private String type;
	private String subType;
	private String brand;

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getSubType() {
		return subType;
	}

	protected void setSubType(String subType) {
		this.subType = subType;
	}

	protected String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected Appliances(String brand) {
		this.brand = brand;
		isOn = false;
	}

	protected void printState() {
		if (isOn) {
			System.out.println(String.format("%s %s is ON.", this.type, this.brand));
		} else {
			System.out.println(String.format("%s %s is OFF.", this.type, this.brand));
		}
	}

	protected boolean getState() {
		return isOn;
	}

	protected void on() {
		isOn = true;
	}

	protected void off() {
		isOn = false;
	}
}
