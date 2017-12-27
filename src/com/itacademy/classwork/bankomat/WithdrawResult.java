package com.itacademy.classwork.bankomat;

import java.util.List;

public class WithdrawResult {
	private String message;

	private List<WithdrawResultItem> items;

	public String getMessage() {
		return message;
	}

	public WithdrawResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<WithdrawResultItem> getItems() {
		return items;
	}
}
