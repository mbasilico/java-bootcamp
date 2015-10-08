package shoppingcart.service;

import java.util.List;

import shoppingcart.model.Cart;

public interface CartService {
	
	public void persist(Cart entity);

	public void update(Cart entity);

	public Cart findById(Long id);

	public void delete(Long id);
	
	public List<Cart> findAll();
	
	public void deleteAll();

}
