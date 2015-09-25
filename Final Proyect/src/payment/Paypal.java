package payment;

import client.Client;
import finalproyect.Counter;
import shoppingCart.ShoppingCart;

public class Paypal implements Payment {

	String email;
	String password;	

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validatePaypal(String email, String password) {
		// validation method of PayPal
		return true;
	}

	@Override
	public void payWith(ShoppingCart cart, Client client) {
		if (validatePaypal(getEmail(), getPassword())) {
			double subtotal = cart.totalPrice();
			double discount = cart.cheapestProduct().getPrice();
			double total = subtotal - discount;

			System.out.println("Payment code " + Counter.getTransactionCount());
			Counter.increaseTransactionCount();
			System.out.println("Subtotal: $" + subtotal + "\n" + "Discount: $" + discount
					+ " The cheapest product for free by Paypal payment. \n" + "Total: $" + total 
					+ "has been paid with Paypal.");
			Transaction t = new Transaction();
			t.getTransaction(cart, client, total);
			// it should save the transaction somewhere, right?
		} else {
			System.out.println("Wrong validation");
		}
	}
}
