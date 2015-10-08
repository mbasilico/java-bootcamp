package shoppingcart.model;

import java.util.List;

public class CreditCardPayment implements PaymentStrategy {

	private String name;
	private int creditCardNumber;
	private float amount;

	public CreditCardPayment(String name, int creditCardNumber) {
		this.name = name;
		this.creditCardNumber = creditCardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float makePayment(List<Item> items) {
		setAmount(new TenPercentDiscount().applyDiscount(items));
		return getAmount();
	}

}
