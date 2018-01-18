package com.itacademy.jd1.classwork.lection11;

import java.io.Serializable;

public class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;// ������, ������, ����� ������ �����, � ������� ��������� ���������
	// ���� ��� ���, �� �� ������� ��������� �������, �������� 2137645349876634987L
	// �� ������� �����, ����� ���-�� ��������!
	// ���� ������ ������ ��� ���������� � ��������, �� ����� �� ����������� � ��
	// ������ ������
	// ���� �������� �� ������� ����� � ��������� �������� � ����, �� ���� �������
	// �� ��������
	private String brand;
	private Integer year;
	private Integer maxSpeed;
	private transient Object object = new Object();// ��� �������� ������ ���������, ��� ����� �������� transient

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
