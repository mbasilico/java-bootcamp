package shoppingcart.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingcart.model.Cart;
import shoppingcart.model.Product;
import shoppingcart.repository.CartRepository;

@Service
public class CartServiceImp implements CartService {
	
	@Autowired
	CartRepository cartRepository;

	public void persist(Cart entity) {
		cartRepository.persist(entity);
	}

	public void update(Cart entity) {
		// TODO Auto-generated method stub
	}

	public Cart findById(Long id) {
		Cart cart = cartRepository.findOne(id);
		return cart;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
	}

	public BigDecimal getTotalPrice(Long cartID) {
		Cart cart = cartRepository.findOne(cartID);
		BigDecimal total = new BigDecimal(0);
		for (Product product : cart.getCart()) {
			total = total.add(product.getPrice());
		}
		return total;
	}

}
