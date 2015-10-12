package shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Autowired
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Item> cartItems = new ArrayList<Item>();


	public ShoppingCart (){
		this.cartItems = new ArrayList<Item>();
	}
	public List<Item> getCart() {
		return cartItems;
	}

	public void setCart(List<Item> cart) {
		this.cartItems = cart;
	}

	public Long getCartID() {
		return id;
	}
	
	public double pay(PaymentStrategy paymentMethod){
		return paymentMethod.makePayment(this.getCart());
	}


}
