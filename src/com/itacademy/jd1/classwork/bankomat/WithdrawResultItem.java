package com.itacademy.jd1.classwork.bankomat;

public class WithdrawResultItem extends AbstractMoneyData {
	private Slot slot;

	public WithdrawResultItem(int quantity, int nominal, Slot slot) {
		super(quantity, nominal);
		this.slot = slot;
	}

	public int getTotal() {
		return getQuantity() * getNominal();
	}

	public void withdrawFromSlot() {
		if (this.getQuantity() == 0) {
			return;
		}

		slot.setQuantity(slot.getQuantity() - this.getQuantity());
	}
}
