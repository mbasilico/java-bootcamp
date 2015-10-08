package shoppingcart.model;

import java.util.List;

public class PayPalPayment implements PaymentStrategy {

	private String email;
	private String password;
	private double amount;

	public PayPalPayment(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double d) {
		this.amount = d;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double makePayment(List<Item> items) {
		setAmount(new CheapestFreeDiscount().applyDiscount(items));
		return getAmount();
	}

}
