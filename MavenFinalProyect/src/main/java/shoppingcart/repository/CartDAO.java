package shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import shoppingcart.model.Cart;

public interface CartDAO extends CrudRepository<Cart, Long> {	
	
//	public void persist(Cart entity);
//	
//	public void update(Cart entity);
//
//	public Cart findById(Long id);
//
//	public void delete(Cart entity);	
	
}
