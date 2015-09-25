package shoppingCart;

import java.util.ArrayList;
import java.util.List;

import product.Product;

public class ShoppingCart {

	public List<Product> cart = new ArrayList<>();
	int cartID;

	public List<Product> getCart() {
		return cart;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCart(List<Product> cart) {
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
		if (!this.cart.isEmpty()) {
			expensive = this.cart.get(0);
			for (Product product : this.cart) {
				if (product.getPrice() > expensive.getPrice()) {
					expensive = product;
				}
			}
		} else {
			expensive = null;
		}
		return expensive;
	}

	@Override
	public String toString() {
		return "ShoppingCart [cart=" + cart + ", cartID=" + cartID + "]";
	}

	public String showProducts() {
		String show = "Content of Cart: \n";
		if (cart.isEmpty()) {
			show += "there are no elements.";
		} else {
			for (Product product : cart) {
				show += "Item Name: " + product.getName() + " .....$ price: " + product.getPrice() + "\n";
			}
		}
		return show;
	}

	public void addProduct(Product product) {
		this.cart.add(product);
	}

	public void deleteProductFromCart(Product product) {
		this.cart.remove(cart.indexOf(product));
	}

	public int countProducts() {
		return cart.size();
	}

}
