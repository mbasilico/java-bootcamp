package shoppingCart;

public class ShoppingCartDirector {

	private ShoppingCartBuilder shoppingCartBuilder;

	public void setShoppingCartBuilder(ShoppingCartBuilder cb) {
		shoppingCartBuilder = cb;
	}

	public ShoppingCart getCart() {
		return shoppingCartBuilder.getShoppingCart();
	}

	public void constructCart() {
		shoppingCartBuilder.createNewCart();
		shoppingCartBuilder.buildCart();
		shoppingCartBuilder.buildCartID();
	}
}
