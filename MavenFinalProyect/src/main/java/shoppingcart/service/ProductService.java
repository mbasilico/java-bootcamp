package shoppingcart.service;

import java.util.List;

import shoppingcart.model.Product;

public interface ProductService {

	public void persist(Product entity);

	public void update(Product entity);

	public Product findById(String id);

	public void delete(String id);
	
	public List<Product> findAll();
	
	public void deleteAll();

}
