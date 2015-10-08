package shoppingcart.model;

import java.util.List;

public class CashPayment implements PaymentStrategy {

	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double d) {
		this.amount = d;
	}

	public double makePayment(List<Item> items) {
		setAmount(new NinetyMostExpensiveDiscount().applyDiscount(items));
		return getAmount();
	}

}
