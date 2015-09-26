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
		try {
			double subtotal = cart.totalPrice();
			double discount = cashDiscount(cart);
			double total = subtotal - discount;

			System.out.println("Payment code: " + Counter.getTransactionCount());
			Counter.increaseTransactionCount();
			System.out.println("Subtotal: $" + subtotal + "\n" + "Discount: $" + discount 
					+ " from 90% of discount on the most expensive product.\n"
					+ "Total: $" + total + " has been paid with Cash.");
			
			Transaction t = new Transaction();
			t.getTransaction(cart, client, total);
			// it should save the transaction somewhere, right?
		} catch (Exception e) {
			System.out.println("it has been an error with payment. " + e);
		}
		// add send mail to Manager
	}
}
