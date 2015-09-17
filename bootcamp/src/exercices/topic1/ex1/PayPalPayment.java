package exercices.topic1.ex1;

import java.util.List;

public class PayPalPayment implements PaymentStrategy {

	private String email;
	private String password;
	private float amount;

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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float makePayment(List<Item> items) {
		setAmount(new CheapestFreeDiscount().applyDiscount(items));
		return getAmount();
	}

}
