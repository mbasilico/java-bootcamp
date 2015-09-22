package exercises.one.shoppingCart;

import exercises.one.product.Product;

public abstract class ShoppingCartBuilder extends ShoppingCart {

	protected ShoppingCart shoppingCart;

	public void createNewCart() {
		shoppingCart = new ShoppingCart();
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public abstract void buildCart();

	public abstract void buildCartID();

	public abstract void addProductToCart(ShoppingCart shoppingCart, Product product);

	public abstract void deleteProductFromCart(ShoppingCart shoppingCart, Product product);

}
