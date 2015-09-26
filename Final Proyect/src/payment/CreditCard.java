package payment;

import shoppingCart.ShoppingCart;
import client.Client;
import finalproyect.Counter;

public class CreditCard implements Payment {

	private String userName;
	private int cardNumber;

	public String getUserName() {
		return userName;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean validateCreditCard(String userName, int cardNumber) {
		// validation method of credit card
		return true;

	}

	public static double creditCardDiscount(ShoppingCart cart) {
		try {
			double discount = cart.totalPrice() * 0.1; // the Manager should have the option to change the %
			return discount;
		} catch (Exception e) {
			System.out.println("There may be no products. "+ e);
			return 0;
		}
	}

	@Override
	public void payWith(ShoppingCart cart, Client client) {
		if (validateCreditCard(getUserName(), getCardNumber())) {
			try {
				double subtotal = cart.totalPrice();
				double discount = creditCardDiscount(cart);
				double total = subtotal - discount;
				System.out.println("Payment code " + Counter.getTransactionCount());
				Counter.increaseTransactionCount();
				System.out.println("Subtotal: $" + subtotal + "\n" + "Discount: $" + discount 
						+ " 10% of discount. \n" + "Total: $" + total + " paid with credit card");
				Transaction t = new Transaction();
				t.getTransaction(cart, client, total);
				// it should save the transaction somewhere, right?
			} catch (Exception e) {
				System.out.println("it has been an error with payment. " + e);
			}
		} else {
			System.out.println("Wrong validation");
		}
		// add send mail to Manager
	}

}
