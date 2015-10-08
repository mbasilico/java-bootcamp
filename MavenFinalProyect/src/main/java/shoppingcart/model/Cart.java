package shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

	@OneToMany
	public List<Product> cart = new ArrayList<Product>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartID", nullable = false)
	private Long cartID;

	@Column(name = "cartUserID", nullable = false)
	private Long cartUserID;

	public Cart() {
	}

	public Cart(List<Product> cart, Long cartID, Long cartUserID) {
		this.cart = cart;
		this.cartID = cartID;
		this.cartUserID = cartUserID;
	}

	public List<Product> getCart() {
		return cart;
	}

	public Long getCartID() {
		return cartID;
	}

	public void setCart(List<Product> cart) {
		this.cart = cart;
	}

	public void setCartID(Long cartID) {
		this.cartID = cartID;
	}

	public Long getCartUserID() {
		return cartUserID;
	}

	public void setCartUserID(Long cartUserID) {
		this.cartUserID = cartUserID;
	}	

	public Product cheapestProduct() {
		Product cheapest;
		if (!cart.isEmpty()) {
			cheapest = cart.get(0);
			for (Product product : cart) {
				// BigDecimal => a.compareTo(b); // returns (-1 if a < b), (0 if
				// a == b), (1 if a > b)
				if (-1 == (product.getPrice()).compareTo(cheapest.getPrice())) {
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
				// BigDecimal => a.compareTo(b); // returns (-1 if a < b), (0 if
				// a == b), (1 if a > b)
				if (1 == (product.getPrice()).compareTo(expensive.getPrice())) {
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

	public void removeProductFromCart(Product product) {
		this.cart.remove(cart.indexOf(product));
	}

	public int countProducts() {
		return cart.size();
	}

}
