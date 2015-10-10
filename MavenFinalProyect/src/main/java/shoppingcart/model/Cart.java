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
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "cart")
public class Cart{	
	
	@Autowired
	@OneToMany //or @ManyToMany?
	public List<Product> cartList = new ArrayList<Product>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartID", nullable = false)
	private Long cartID;

	@Column(name = "cartUserID", nullable = false)
	private Long cartUserID;

	public Cart() {
	}

	public Cart(List<Product> cart, Long cartUserID) {
		this.cartList = cart;		
		this.cartUserID = cartUserID;
	}

	public List<Product> getCart() {
		return cartList;
	}

	public Long getCartID() {
		return cartID;
	}

	public void setCart(List<Product> cart) {
		this.cartList = cart;
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

	@Override
	public String toString() {
		return "ShoppingCart [cart=" + cartList + ", cartID=" + cartID + "]";
	}	

}
