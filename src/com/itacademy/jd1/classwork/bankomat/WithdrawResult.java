package com.itacademy.jd1.classwork.bankomat;

import java.util.List;

public class WithdrawResult {
	
	private String message;
	
	private List<WithdrawResultItem> items;

	public WithdrawResult(String message, List<WithdrawResultItem> items) {
		super();
		this.message = message;
		this.items = items;
	}

	public String getMessage() {
		return message;
	}

	public List<WithdrawResultItem> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "WithdrawResult [message=" + message + ", items=" + items + "]";
	}

	
	
}
