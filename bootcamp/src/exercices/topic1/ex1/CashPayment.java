package exercices.topic1.ex1;

import java.util.List;

public class CashPayment implements PaymentStrategy {

	private float amount;

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float makePayment(List<Item> items) {
		setAmount(new NinetyMostExpensiveDiscount().applyDiscount(items));
		return getAmount();
	}

}
