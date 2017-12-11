package com.itacademy.classwork.lection7;

public class Lection74 {

	public static void main(String[] args) {

		Car car = new PassengerCar();// слева от равно использовать как можно более абстрактный тип, если это
										// возможно
		doSomethingWithCar(car);
		doSomethingElseWithCar(car);
	}

	public static void doSomethingWithCar(Car car) {
		car.move();
	}

	public static void doSomethingElseWithCar(Car car) {
		car.move();
	}

}
