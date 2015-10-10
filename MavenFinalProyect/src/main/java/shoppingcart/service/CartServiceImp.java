package shoppingcart.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingcart.model.Cart;
import shoppingcart.model.Product;
import shoppingcart.repository.CartDAO;
import shoppingcart.repository.ProductDAOImp;

@Service
public class CartServiceImp implements CartService {

	@Autowired
	CartDAO cartDAOImp;
	
	@Autowired
	ProductDAOImp productDAOImp;

	static {
		System.out.println("Inici� CartServiceImp");
	}

	public void persist(Cart entity) {
		cartDAOImp.save(entity);
		//cartDAOImp.persist(entity);
	}

	public void update(Cart entity) {
		cartDAOImp.save(entity);
//		cartDAOImp.update(entity);
	}

	public Cart findById(Long id) {
		Cart cart = cartDAOImp.findOne(id);
		return cart;
	}

	public void delete(Long id) {
		Cart cart = cartDAOImp.findOne(id);
		cartDAOImp.delete(cart);
	}

	public BigDecimal getTotalPrice(Long cartID) {
		Cart cart = cartDAOImp.findOne(cartID);
		BigDecimal total = new BigDecimal(0);
		for (Product product : cart.getCart()) {
			total = total.add(product.getPrice());
		}
		return total;
	}

	public Product cheapestProduct(Long id) {
		Product cheapest;
		Cart cart = cartDAOImp.findOne(id);
		if (!cart.cartList.isEmpty()) {
			cheapest = cart.cartList.get(0);
			for (Product product : cart.cartList) {
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

	public Product expensiveProduct(Long id) {
		Product expensive;
		Cart cart = cartDAOImp.findOne(id);
		if (!cart.cartList.isEmpty()) {
			expensive = cart.cartList.get(0);
			for (Product product : cart.cartList) {
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

	public String showProducts(Long id) {
		Cart cart = cartDAOImp.findOne(id);
		String show = "Content of Cart: \n";
		if (!cart.cartList.isEmpty()) {
			show += "there are no elements.";
		} else {
			for (Product product : cart.cartList) {
				show += "Item Name: " + product.getName() + " .....$ price: " + product.getPrice() + "\n";
			}
		}
		return show;
	}

	public void addProduct(Long productID, Long cartID) {
		Cart cart = cartDAOImp.findOne(cartID);
		Product product = productDAOImp.findById(productID);
		cart.cartList.add(product);
		cartDAOImp.save(cart);
	}

	public void removeProductFromCart(Long productID, Long cartID) {
		Cart cart = cartDAOImp.findOne(cartID);
		Product product = productDAOImp.findById(productID);
		cart.cartList.remove(product);
		cartDAOImp.save(cart);
	}

	public int countProducts(Long cartID) {
		Cart cart = cartDAOImp.findOne(cartID);
		return cart.cartList.size();
	}

}
