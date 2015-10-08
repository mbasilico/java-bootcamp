package shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {	
	
	public void persist(Cart entity);
	
	public Cart findOne(ID id);
	
}
