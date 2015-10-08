package shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {

	@OneToMany
	public List<Item> cart = new ArrayList<Item>();

	@Id
	@GeneratedValue
	int cartID;

	public List<Item> getCart() {
		return cart;
	}

	public void setCart(List<Item> cart) {
		this.cart = cart;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

}
