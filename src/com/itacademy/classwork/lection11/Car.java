package com.itacademy.classwork.lection11;

import java.io.Serializable;

public class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;// версия, меняем, когда меняем класс, в котором критичные изменения
	// если его нет, то он генерит случайным образом, например 2137645349876634987L
	// но генерит новое, когда что-то поменяли!
	// если делаем просто для сохранения и поднятия, то можно не отслеживать и не
	// писать версии
	// если делается на большое время и постоянно работаем с этим, то надо следить
	// за версиями
	private String brand;
	private Integer year;
	private Integer maxSpeed;
	private transient Object object = new Object();// это свойство нельзя сохранять, для этого делается transient

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", year=" + year + ", object=" + object + "]";
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
