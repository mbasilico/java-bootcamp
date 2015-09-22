package exercises.one.shoppingCart;

import java.util.ArrayList;

import exercises.one.product.Product;

public class ShoppingCart {

	ArrayList<Product> cart;
	int cartID;

	@Override
	public String toString() {
		return "ShoppingCart [cart=" + cart + ", cartID=" + cartID + "]";
	}

	public ArrayList<Product> getCart() {
		return cart;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCart(ArrayList<Product> cart) {
		this.cart = cart;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public double totalPrice() {
		double total = 0;
		for (Product product : cart) {
			total += product.getPrice();
		}
		return total;
	}

	public Product cheapestProduct() {
		Product cheapest;
		if (!cart.isEmpty()) {
			cheapest = cart.get(0);
			for (Product product : cart) {
				if (product.getPrice() < cheapest.getPrice()) {
					cheapest = product;
				}
			}
		} else {
			cheapest = null;
		}
		return cheapest;
	}

	public Product expensiveProduct() {
		Product expensive;
		if (!cart.isEmpty()) {
			expensive = cart.get(0);
			for (Product product : cart) {
				if (product.getPrice() > expensive.getPrice()) {
					expensive = product;
				}
			}
		} else {
			expensive = null;
		}
		return expensive;
	}

	public String showProducts() {
		String show = "Content of catalogue: \n";
		if (cart.isEmpty()) {
			show += "there are no elements.";
		} else {
			for (Product product : cart) {
				show += "Item Name: " + product.getName() + " .....$ price: " + product.getPrice() + "\n";
			}
		}
		return show;
	}

}
