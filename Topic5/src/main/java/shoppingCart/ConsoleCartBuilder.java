package shoppingCart;

import finalproyect.Counter;

public class ConsoleCartBuilder extends ShoppingCartBuilder {

	@Override
	public void buildCart() {
		shoppingCart.setCart(cart);
	}

	@Override
	public void buildCartID() {
		shoppingCart.setCartID(Counter.getCartID());
	}	
}
