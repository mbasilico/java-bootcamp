package shoppingcart.service;

import java.util.List;

import shoppingcart.model.Product;

public interface ProductService {

	public void persist(Product entity);

	public void update(Product entity);

	public Product findById(Long id);

	public void delete(Long id);
	
	public List<Product> findAll();
	
	public void deleteAll();

}
