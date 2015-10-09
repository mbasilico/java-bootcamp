package shoppingcart.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import shoppingcart.model.ShoppingCart;


@Repository

public interface ShoppingCartDAO extends CrudRepository<ShoppingCart, Long>{ 
	
	
}
