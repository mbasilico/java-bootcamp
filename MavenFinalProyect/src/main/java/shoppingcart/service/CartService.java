package shoppingcart.service;

import shoppingcart.model.Cart;
import shoppingcart.model.Product;

public interface CartService {

	public void persist(Cart entity);

	public void update(Cart entity);

	public Cart findById(Long id);

	public void delete(Long id);

	public Product cheapestProduct(Long id);

	public Product expensiveProduct(Long id);

}
