package shoppingCart;

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

}
