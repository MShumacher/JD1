package com.itacademy.classwork.bankomat;

public class Slot extends AbstractMoneyData {

	public Slot(int nominal, int quantity) {
		super(nominal, quantity);
		// TODO Auto-generated constructor stub
	}

	public boolean isApplicable(int nominal) {
		// TODO Auto-generated method stub
		return getNominal() == nominal;
	}

	public void add(int moreMoney) {
		setQuantity(getQuantity() + (moreMoney));
	}
		public WithdrawResultItem prepareWithdraw(int requiredSum) {
			int quantityToWithdraw=requiredSum % getNominal();
			WithdrawresultItem withdrawresultItem = new WithdrawresultItem;(Math.min(getQuantity(), quan)
		}

	}

