package exercises.one.shoppingCart;

import exercises.one.Counter;
import exercises.one.product.Product;

public class ConsoleCartBuilder extends ShoppingCartBuilder {

	@Override
	public void buildCart() {
		shoppingCart.setCart(cart);
	}

	@Override
	public void buildCartID() {
		shoppingCart.setCartID(Counter.getCartID());
	}

	@Override
	public void addProductToCart(ShoppingCart shoppingCart, Product product) {
		shoppingCart.cart.add(product);
	}

	@Override
	public void deleteProductFromCart(ShoppingCart shoppingCart, Product product) {
		shoppingCart.cart.remove(shoppingCart.cart.indexOf(product));		
	}

}
