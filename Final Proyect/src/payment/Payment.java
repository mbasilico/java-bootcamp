package payment;

import client.Client;
import shoppingCart.ShoppingCart;

public interface Payment {
	
	public void payWith(ShoppingCart cart, Client client);
	
}
