package payment;

import client.Client;
import finalproyect.Counter;
import shoppingCart.ShoppingCart;

public class Cash implements Payment {

	public static double cashDiscount(ShoppingCart cart) {		
		try {
			double discount;
			discount = cart.expensiveProduct().getPrice() * 0.9;
			return discount;
		} catch (Exception e) {
			System.out.println("There may be no products. "+ e);
			return 0;
		}					
	}

	@Override
	public void payWith(ShoppingCart cart, Client client) {
		double subtotal = cart.totalPrice();
		double discount = cashDiscount(cart);
		double total = subtotal - discount;

		System.out.println("Payment code: " + Counter.getTransactionCount());
		Counter.increaseTransactionCount();
		System.out.println("Subtotal: $" + subtotal + "\n" + "Discount: $" + discount 
				+ " from 90% of discount on the most expensive product.\n"
				+ "Total: $" + total + " has been paid with Cash.");
		
		// add Transaction
		// add send mail to Manager
	}
}
