package com.itacademy.classwork.practicThreads.customs;

import java.util.LinkedList;
import java.util.List;

public class Counter {
	private List<Integer> counter = new LinkedList<Integer>();

	public List<Integer> getQueue() {
		return counter;
	}

	public void setQueue(List<Integer> counter) {
		this.counter = counter;
	}

	public void addCar(int i) {
		counter.add(i);
	}

	public void print() {
		System.out.println(counter);
	}

}
