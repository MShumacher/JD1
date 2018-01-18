package com.itacademy.jd1.part1.classwork.bankomat;

public class Slot extends AbstractMoneyData {

	public Slot(int quantity, int nominal) {
		super(quantity, nominal);
	}

	public boolean isApplicable(int nominal) {
		return getNominal() == nominal;
	}

	public void add(int moreMoney) {
		setQuantity(getQuantity() + moreMoney);
	}

	public WithdrawResultItem prepareWithdraw(int requiredSum) {
		int quantityToWithdraw = requiredSum / getNominal();

		WithdrawResultItem withdrawResultItem = new WithdrawResultItem(
				Math.min(getQuantity(), quantityToWithdraw), getNominal(), this);
		return withdrawResultItem;
	}
}
